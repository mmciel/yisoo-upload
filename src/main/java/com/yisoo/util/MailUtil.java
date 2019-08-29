package com.yisoo.util;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.internet.*;
import java.util.Date;
import java.util.Properties;

public class MailUtil {

    // 发件人的 邮箱 和 密码
    public static String sendEmailAccount = "481985007@qq.com";
    public static String sendEmailPwd = "zvyktnnhvifzbhah";
    // 发件人邮箱的 SMTP 服务器地址
    public static String myEmailSMTPHost = "smtp.qq.com";
    // 收件人邮箱
    public String receiveMailAccount = null;
    //会话对象
    public Session session = null;



    public MailUtil(){
        // 1. 创建参数配置, 用于连接邮件服务器的参数配置
        Properties props = new Properties();                    // 参数配置
        props.setProperty("mail.transport.protocol", "smtp");   // 使用的协议（JavaMail规范要求）
        props.setProperty("mail.smtp.host", myEmailSMTPHost);   // 发件人的邮箱的 SMTP 服务器地址
        props.setProperty("mail.smtp.auth", "true");            // 需要请求认证

        final String smtpPort = "465";
        props.setProperty("mail.smtp.port", smtpPort);
        props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.setProperty("mail.smtp.socketFactory.fallback", "false");
        props.setProperty("mail.smtp.socketFactory.port", smtpPort);

        // 2. 根据配置创建会话对象, 用于和邮件服务器交互
        session = Session.getInstance(props);
//        session.setDebug(true);
    }
    public static MimeMessage createMimeMessage(
            Session session,
            String sendMail,
            String receiveMail,
            String sendPersonal,
            String receivePersonal,
            String eTitle,
            String filePath
            ) throws Exception {
        // 1. 创建邮件对象
        MimeMessage message = new MimeMessage(session);
        // 2. From: 发件人
        message.setFrom(new InternetAddress(sendMail, sendPersonal, "UTF-8"));
        // 3. To: 收件人（可以增加多个收件人、抄送、密送）
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(receiveMail, receivePersonal, "UTF-8"));
        // 4. Subject: 邮件主题
        message.setSubject(eTitle, "UTF-8");


        // 9. 创建附件“节点”
        MimeBodyPart attachment = new MimeBodyPart();
        DataHandler attDataHandler = new DataHandler
                (new FileDataSource(filePath));  // 读取本地文件
        attachment.setDataHandler(attDataHandler);                                             // 将附件数据添加到“节点”
        attachment.setFileName(MimeUtility.encodeText(attDataHandler.getName()));              // 设置附件的文件名（需要编码）
        // 10. 设置（文本+图片）和 附件 的关系（合成一个大的混合“节点” / Multipart ）
        MimeMultipart mm = new MimeMultipart();
        mm.addBodyPart(attachment);     // 如果有多个附件，可以创建多个多次添加
        mm.setSubType("mixed");         // 混合关系

        // 11. 设置整个邮件的关系（将最终的混合“节点”作为邮件的内容添加到邮件对象）
        message.setContent(mm);


        // 12. 设置发件时间
        message.setSentDate(new Date());

        // 13. 保存上面的所有设置
        message.saveChanges();

        return message;
    }
}

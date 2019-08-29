package com.yisoo.test;


import com.yisoo.util.MailUtil;
import org.junit.Test;

import java.util.Date;
import java.util.Properties;
//222
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeUtility;

public class javamail {

    public static String sendEmailAccount = "481985007@qq.com";
    public static String sendEmailPwd = "zvyktnnhvifzbhah";
    // 收件人邮箱（替换为自己知道的有效邮箱）
    public static String receiveMailAccount = "761998179@qq.com";

    @Test
    public void s() throws Exception {
        MailUtil mailUtil = new MailUtil();
        Session session = mailUtil.session;
        // 3. 创建一封邮件
        MimeMessage message = mailUtil.createMimeMessage(session, sendEmailAccount, receiveMailAccount,
                "YiSooEmail","admin","YiSoo-文件","C:\\Users\\mmciel\\Desktop\\传给方烁参考+软著资料+2019.08.07.zip");
        // 4. 根据 Session 获取邮件传输对象
        Transport transport = session.getTransport();

        // 5. 使用 邮箱账号 和 密码 连接邮件服务器
        //    这里认证的邮箱必须与 message 中的发件人邮箱一致，否则报错
        transport.connect(sendEmailAccount, sendEmailPwd);

        // 6. 发送邮件, 发到所有的收件地址, message.getAllRecipients() 获取到的是在创建邮件对象时添加的所有收件人, 抄送人, 密送人
        transport.sendMessage(message, message.getAllRecipients());
        // 7. 关闭连接
        transport.close();
    }


}


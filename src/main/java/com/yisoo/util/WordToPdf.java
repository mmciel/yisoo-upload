package com.yisoo.util;

import com.aspose.words.Document;
import com.aspose.words.License;
import com.aspose.words.SaveFormat;

import java.io.*;

public class WordToPdf {
    public static boolean getLicense() {
        boolean result = false;
        try {
//            InputStream is = new FileInputStream(new File("C:\\Users\\mmciel\\Desktop\\license.xml"));//  license.xml应放在..\WebRoot\WEB-INF\classes路径下
            // 凭证
            String licenseStr = "<License>\n" +
                "  <Data>\n" +
                "    <Products>\n" +
                "      <Product>Aspose.Total for Java</Product>\n" +
                "      <Product>Aspose.Words for Java</Product>\n" +
                "    </Products>\n" +
                "    <EditionType>Enterprise</EditionType>\n" +
                "    <SubscriptionExpiry>20991231</SubscriptionExpiry>\n" +
                "    <LicenseExpiry>20991231</LicenseExpiry>\n" +
                "    <SerialNumber>8bfe198c-7f0c-4ef8-8ff0-acc3237bf0d7</SerialNumber>\n" +
                "  </Data>\n" +
                "  <Signature>sNLLKGMUdF0r8O1kKilWAGdgfs2BvJb/2Xp8p5iuDVfZXmhppo+d0Ran1P9TKdjV4ABwAgKXxJ3jcQTqE/2IRfqwnPf8itN8aFZlV3TJPYeD3yWE7IT55Gz6EijUpC7aKeoohTb4w2fpox58wWoF3SNp6sK6jDfiAUGEHYJ9pjU=</Signature>\n" +
                "</License>";
            InputStream is = new ByteArrayInputStream(licenseStr.getBytes("UTF-8"));
            License aposeLic = new License();
            aposeLic.setLicense(is);
            result = true;
//            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    public static void doc2pdf(String word,String pdf) {

        if (!getLicense()) {          // 验证License 若不验证则转化出的pdf文档会有水印产生
            return;
        }
        try {
//            long old = System.currentTimeMillis();
            File file = new File(pdf);  //新建一个空白pdf文档
            FileOutputStream os = new FileOutputStream(file);
            Document doc = new Document(word);                    //Address是将要被转化的word文档
            doc.save(os, SaveFormat.PDF);//全面支持DOC, DOCX, OOXML, RTF HTML, OpenDocument, PDF, EPUB, XPS, SWF 相互转换
//            long now = System.currentTimeMillis();
//            System.out.println("共耗时：" + ((now - old) / 1000.0) + "秒");  //转化用时
//            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

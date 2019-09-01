package com.yisoo.test;

import com.aspose.words.Document;
import com.aspose.words.License;
import com.aspose.words.SaveFormat;
import com.yisoo.util.WordToPdf;
import org.apache.commons.io.IOUtils;
import org.hibernate.validator.internal.util.logging.LoggerFactory;
import org.junit.Test;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

/**
 * <b><code>Word2PdfUtil</code></b>
 * <p>
 * Description: word to pdf util.
 * <p>
 * <b>Creation Time:</b> 2018/5/15 15:10
 *
 * @author
 * @date 2018 /5/15
 * @since JDK 1.7
 */
public class view {

    /**
     * The constant LOG.
     *
     */
//    private static final Logger LOG = LoggerFactory.getLogger(view.class);

    /**
     * 获取license
     *
     * @return
     */
    @Test
    public void s(){
        WordToPdf.doc2pdf("C:\\Users\\mmciel\\Desktop\\213.docx","C:\\Users\\mmciel\\Desktop\\213.pdf");

    }

}
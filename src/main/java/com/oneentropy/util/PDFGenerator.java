package com.oneentropy.util;

import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.layout.Canvas;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.oneentropy.common.Constants;
import com.oneentropy.model.Component;
import org.apache.maven.plugin.logging.Log;
import org.apache.maven.plugin.logging.SystemStreamLog;

import java.io.File;
import java.io.FileNotFoundException;

public class PDFGenerator {

    private static Log logger = new SystemStreamLog();

    public static void generatePDF(Component component, String hldDir, String filePath) throws FileNotFoundException {
        String outputDir = FileUtil.concatPath(hldDir + File.separator + Constants.OUTPUT_DIR, filePath, "pdf");
        FileUtil.preparePath(outputDir);
        PdfWriter pdfWriter = new PdfWriter(outputDir);
        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        Paragraph  paragraph = new Paragraph("The quick brown fox");
        PdfPage pdfPage = pdfDocument.addNewPage();
        Rectangle ps = pdfPage.getPageSize();
        PdfCanvas canvas = new PdfCanvas(pdfPage);
        Rectangle rect = new Rectangle(ps.getWidth() - 90, ps.getHeight() - 100, 50, 50);
        new Canvas(canvas, ps)
                .setFontSize(12)
                .add(paragraph);
        canvas.rectangle(rect)
                .fillStroke();
        pdfDocument.close();
    }


}

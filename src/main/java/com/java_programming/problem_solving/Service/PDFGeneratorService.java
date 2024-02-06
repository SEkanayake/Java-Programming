package com.java_programming.problem_solving.Service;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;
import com.lowagie.text.*;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class PDFGeneratorService {

    public void export(HttpServletResponse response) throws IOException {

        Document doc = new Document(PageSize.A4);
        try {
            PdfWriter writer = PdfWriter.getInstance(doc, response.getOutputStream());
            doc.open();

            // Create PdfContentByte object
            PdfContentByte cb = writer.getDirectContent();

            // Set blue color for the box
            cb.setColorFill(new BaseColor(0, 0, 255)); // Blue color

            // Draw a blue box in the left corner
            cb.rectangle(50, doc.getPageSize().getHeight() - 100, 100, 50); // x, y, width, height
            cb.fill();

            doc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

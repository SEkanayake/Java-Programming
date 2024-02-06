package com.java_programming.problem_solving.Service;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Service;

import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPCell;

import java.io.IOException;

@Service
public class PDFGeneratorService2 {

    public void export2(HttpServletResponse response) throws IOException {

        Document doc = new Document(PageSize.A4);
        try {
            PdfWriter.getInstance(doc, response.getOutputStream());
            doc.open();

            // Create a table with 3 columns
            PdfPTable table = new PdfPTable(3);
            table.setWidthPercentage(100); // Table width 100%

            // Create a font for the word "SARALA"
            Font fontSarala = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14);

            // Left cell - SARALA
            PdfPCell leftCell = new PdfPCell(new Paragraph("SARALA", fontSarala));
            leftCell.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
            leftCell.setBorder(PdfPCell.NO_BORDER);
            table.addCell(leftCell);

            // Middle cell - SARALA
            PdfPCell middleCell = new PdfPCell(new Paragraph("SARALA", fontSarala));
            middleCell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            middleCell.setBorder(PdfPCell.NO_BORDER);
            table.addCell(middleCell);

            // Right cell - SARALA
            PdfPCell rightCell = new PdfPCell(new Paragraph("SARALA", fontSarala));
            rightCell.setHorizontalAlignment(PdfPCell.ALIGN_RIGHT);
            rightCell.setBorder(PdfPCell.NO_BORDER);
            table.addCell(rightCell);

            doc.add(table); // Add table to document

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (doc != null) {
                doc.close();
            }
        }
    }
}

package com.java_programming.problem_solving.Service;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class PDFGeneratorService3 {

    public void export3(HttpServletResponse response) throws IOException {

        Document doc = new Document(PageSize.A4);
        try {
            PdfWriter.getInstance(doc, response.getOutputStream());
            doc.open();

            Font fontTitle = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
            fontTitle.setSize(20);
            Paragraph title = new Paragraph("This is title..", fontTitle);
            title.setAlignment(Paragraph.ALIGN_CENTER);
            doc.add(title);

            Font fontPage = FontFactory.getFont(FontFactory.HELVETICA);
            fontPage.setSize(14);
            Paragraph content = new Paragraph("Content...", fontPage);
            content.setAlignment(Paragraph.ALIGN_CENTER);
            doc.add(content);

            // Create a table
            PdfPTable table = new PdfPTable(3); // 3 columns
            table.setWidthPercentage(100); // Table width 100%

            // Add table headers
            PdfPCell cell1 = new PdfPCell(new Paragraph("Column 1"));
            PdfPCell cell2 = new PdfPCell(new Paragraph("Column 2"));
            PdfPCell cell3 = new PdfPCell(new Paragraph("Column 3"));

            table.addCell(cell1);
            table.addCell(cell2);
            table.addCell(cell3);

            // Add table data
            for (int i = 0; i < 5; i++) {
                table.addCell("Data " + i + ",1");
                table.addCell("Data " + i + ",2");
                table.addCell("Data " + i + ",3");
            }

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

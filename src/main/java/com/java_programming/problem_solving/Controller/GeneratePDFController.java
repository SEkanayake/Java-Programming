package com.java_programming.problem_solving.Controller;

import com.java_programming.problem_solving.Service.PDFGeneratorService;
import com.java_programming.problem_solving.Service.PDFGeneratorService2;
import com.java_programming.problem_solving.Service.PDFGeneratorService3;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@CrossOrigin("*")
@RestController
@RequestMapping("api/v1/pdf")
public class GeneratePDFController {

    private final PDFGeneratorService pdfGeneratorService;
    private final PDFGeneratorService2 pdfGeneratorService2;
    private final PDFGeneratorService3 pdfGeneratorService3;

    public GeneratePDFController(PDFGeneratorService pdfGeneratorService, PDFGeneratorService2 pdfGeneratorService2, PDFGeneratorService3 pdfGeneratorService3) {
        this.pdfGeneratorService = pdfGeneratorService;
        this.pdfGeneratorService2 = pdfGeneratorService2;
        this.pdfGeneratorService3 = pdfGeneratorService3;
    }

    @GetMapping()
    public void generatePdf(HttpServletResponse response) throws IOException {

        response.setContentType("application/pdf");
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
        String currentDateTime = dateFormat.format(new Date());

        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=pdf_" + currentDateTime + ".pdf";
        response.setHeader(headerKey, headerValue);

        this.pdfGeneratorService.export(response);
    }

    @GetMapping("row")
    public void generatePdf2(HttpServletResponse response) throws IOException {

        response.setContentType("application/pdf");
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
        String currentDateTime = dateFormat.format(new Date());

        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=pdf_" + currentDateTime + ".pdf";
        response.setHeader(headerKey, headerValue);

        this.pdfGeneratorService2.export2(response);
    }

    @GetMapping("table")
    public void generatePdf3(HttpServletResponse response) throws IOException {

        response.setContentType("application/pdf");
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
        String currentDateTime = dateFormat.format(new Date());

        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=pdf_" + currentDateTime + ".pdf";
        response.setHeader(headerKey, headerValue);

        this.pdfGeneratorService3.export3(response);
    }
}

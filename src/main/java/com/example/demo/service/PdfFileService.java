package com.example.demo.service;

import java.io.FileNotFoundException;

import org.springframework.stereotype.Service;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.List;
import com.itextpdf.layout.element.Paragraph;

@Service
public class PdfFileService {

	public void pdfCreation()
	{
		String filepath="C:\\Users\\annap\\Desktop\\PdfFiles\\simplelist.pdf";
		String para1="Hello,good moring welcome to the cs Academy pdfFile Creation tutorial";
		
		try{
			PdfWriter writer=new PdfWriter(filepath);
			PdfDocument pdfdoc=new PdfDocument(writer);
			Paragraph p1=new Paragraph(para1);
			List list=new List();
			list.add("Java");
			list.add("Python");
			list.add("C#");
			list.add("C");
			
			Document document=new Document(pdfdoc);
			document.add(p1);
			document.add(list);
			
			document.close();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	

}

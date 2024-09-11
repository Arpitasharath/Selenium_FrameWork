package DDT;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class ReadDataFromPDF {

	public static void main(String[] args) throws Throwable {
		
		File fis = new File ("./src\\test\\resources\\sample-1.pdf");
		
		PDDocument doc = PDDocument.load(fis);
		
//		int pages = doc.getNumberOfPages();
//		System.out.println(pages);
	
		PDFTextStripper pdfData = new PDFTextStripper();
	
//		String read=pdfData.getText(doc);
//		
//		System.out.println(read);
		
		pdfData.setStartPage(1);
		pdfData.setEndPage(1);
		String read=pdfData.getText(doc);
		System.out.println(read);
		
		
		
		

	}

}

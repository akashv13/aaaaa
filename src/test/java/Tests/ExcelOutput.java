package Tests;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOutput {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file=new FileOutputStream("C:\\Users\\Akash\\eclipse-workspace\\test4\\SDET24\\EXCEL\\NEW.xlsx");
		XSSFWorkbook book=new XSSFWorkbook();
		
		
		XSSFSheet sheet=book.createSheet("Sheet1");
		
		XSSFRow row1=sheet.createRow(0);
		row1.createCell(0).setCellValue("NAME");
		row1.createCell(1).setCellValue("CITY");
		row1.createCell(2).setCellValue("JOB");
		row1.createCell(3).setCellValue("PH.NO");
		
		XSSFRow row2=sheet.createRow(1);
		row2.createCell(0).setCellValue("Akash");
		row2.createCell(1).setCellValue("pune");
		row2.createCell(2).setCellValue("QA");
		row2.createCell(3).setCellValue("9898");
		
		XSSFRow row3= sheet.createRow(2);
		row3.createCell(0).setCellValue("sangram");
		row3.createCell(1).setCellValue("aitwade");
		row3.createCell(2).setCellValue("Mech");
		row3.createCell(3).setCellValue("8487");
		
		book.write(file);
		book.close();
		file.close();
		
		System.out.println("done");
	}

}

package UTILS;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	public static XSSFWorkbook book;
	public ExcelDataProvider() throws IOException{
		String path ="C:\\Users\\Akash\\eclipse-workspace\\test4\\SDET24\\EXCEL\\Data.xlsx";
		FileInputStream file=new FileInputStream(path);
		book=new XSSFWorkbook(file);
		
	}
	
	public String getExcel(String name,int row, int cell) {
		return book.getSheet(name).getRow(row).getCell(cell).getStringCellValue();
		
	}

	
	
}


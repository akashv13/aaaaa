package UTILS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	
		public static FileInputStream file;
		public static XSSFWorkbook book;
		public static XSSFSheet sheet;
		public static XSSFRow row;
		public static XSSFCell cell;
		public static FileOutputStream fileOut;

	private static int getRowCount(String ExcelFile, String SheetName) throws IOException {
		file=new FileInputStream(ExcelFile);
		book=new XSSFWorkbook(file);
		sheet=book.getSheet(SheetName);	
		int rowCount=sheet.getLastRowNum();
		book.close();
		file.close();
		return rowCount;
		
	}
	
	public static int getCellCount(String ExcelFile, String SheetName, int rowNum) throws IOException {
		file=new FileInputStream(ExcelFile);
		book=new XSSFWorkbook(file);
		sheet=book.getSheet(SheetName);
		row=sheet.getRow(rowNum);
		int cellCount=row.getLastCellNum();
		book.close();
		file.close();
		return cellCount;	
	}
	
	public static String getCellData(String ExcelFile, String SheetName, int rowNum,int cellNum ) throws IOException {
		file=new FileInputStream(ExcelFile);
		book=new XSSFWorkbook(file);
		sheet=book.getSheet(SheetName);
		row=sheet.getRow(rowNum);
		cell=row.getCell(cellNum);
		String cellData=cell.toString();
		book.close();
		file.close();
		return cellData;
		
	}
	
	public static void setCellData(String ExcelFile, String SheetName, int rowNum, int cellNum, String data) throws IOException {
		file=new FileInputStream(ExcelFile);
		fileOut=new FileOutputStream(ExcelFile);
		book=new XSSFWorkbook();
		sheet=book.getSheet(SheetName);
		row=sheet.createRow(rowNum);
		cell=row.createCell(cellNum);
		cell.setCellValue(data);
		book.write(fileOut);
		book.close();
		file.close();
		
		
		
	}
	
	
	
	

}

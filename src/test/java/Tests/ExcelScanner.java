package Tests;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelScanner {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file=new FileOutputStream("C:\\Users\\Akash\\eclipse-workspace\\test4\\SDET24\\EXCEL\\ScannerExcel.xlsx");
		XSSFWorkbook book=new XSSFWorkbook();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Sheet Nmae");
		XSSFSheet sheet=book.createSheet(sc.next());
		
		System.out.println("No of rows?");
		int rows=sc.nextInt();
		System.out.println("No of cells?");
		int cells=sc.nextInt();
		
		for(int i=0;i<rows;i++) {
			XSSFRow row=sheet.createRow(i);
			for(int j=0;j<cells;j++) {
				XSSFCell cell=row.createCell(j);
				cell.setCellValue(sc.next());
			}
		}
		
		book.write(file);
		book.close();
		file.close();
		System.out.println("file closed");

	}

}

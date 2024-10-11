package Tests;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exceltest {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\Akash\\eclipse-workspace\\test4\\SDET24\\EXCEL\\Data.xlsx");
        XSSFWorkbook book=new XSSFWorkbook(file);
        XSSFSheet sheet=book.getSheet("Sheet1");
        
        int rows=sheet.getLastRowNum();
        int cells=sheet.getRow(0).getLastCellNum();
        for(int i=0;i<rows;i++) {
        	XSSFRow row=sheet.getRow(i);
        	
        	for(int j=0;j<cells;j++) {
        		XSSFCell cell=row.getCell(j);
        		System.out.print(cell.toString()+"\t");
        	}
        	System.out.println();
        }
book.close();
file.close();
	}

}

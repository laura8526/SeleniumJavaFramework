package utils_excel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Utils {
	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet ;
	
	public Excel_Utils(String excelPath, String sheetName) throws IOException {
		projectPath = System.getProperty("user.dir");
		 workbook = new XSSFWorkbook(excelPath);
		sheet = workbook.getSheet(sheetName);
	}
	
public static void main(String[] args) throws IOException {
	//getRowCount1();
	getCellData(0,0); 
	getCellDataNumber(1,1);
}
	public static int getRowCount1() throws IOException{
		int rowCount=0;
	rowCount=sheet.getPhysicalNumberOfRows();
	System.out.println("No.of rows :  "+rowCount);
	return rowCount;
	}
	
	public static int getColumnCount1() throws IOException{
		int colCount=0;
		 colCount=sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("No.of rows :  "+colCount);
		return colCount;
		}
	public static String getCellData(int rownum,int colnum) throws IOException {
		String cellData = null;
		 cellData = sheet.getRow(rownum).getCell(colnum).getStringCellValue();
		System.out.println(cellData);
		return cellData;
	}
	
	public static void getCellDataNumber(int rowNum,int colNum) throws IOException {
		
		double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		System.out.println(cellData);
	}
}

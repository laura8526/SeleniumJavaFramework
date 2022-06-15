package utils_excel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilsDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String projectPath = System.getProperty("user.dir");
		 Excel_Utils excel = new Excel_Utils(projectPath+"/excel/data.xlsx", "Sheet1");
		 excel.getRowCount1();
		 excel.getCellData(0, 0);
		 excel.getCellDataNumber(1, 1);
	}

}

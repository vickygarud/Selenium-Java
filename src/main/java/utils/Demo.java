package utils;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo {

	static Workbook wb;
	static Sheet sheet;

	public void getExcelFileInstance(String filePath, FileInputStream input) throws IOException {

		String extension = filePath.substring(filePath.indexOf("."));
		if (extension.equals(".xlsx")) {
			wb = new XSSFWorkbook(input);
		} else if (extension.equals(".xlx")) {
			wb = new HSSFWorkbook(input);
		}
	}

	public void getExcelData(String filePath, String sheetName) throws IOException {

		FileInputStream input = new FileInputStream(filePath);
		getExcelFileInstance(filePath, input);

		int no = wb.getNumberOfSheets();
		for (int i = 0; i <= no; i++) {
			if (wb.getSheetAt(i).getSheetName().equalsIgnoreCase(sheetName))
				sheet = wb.getSheetAt(i);
		}

		int rows = sheet.getLastRowNum();

		int cols = sheet.getRow(0).getPhysicalNumberOfCells();

	}

}

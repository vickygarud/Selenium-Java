package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;

public class ExcelUtil {

	private static Row row;
	public static Sheet sheet;
	private static Workbook workbook;

	public static void getWorkbookInstance(String filePath, FileInputStream input) throws IOException {

		String extension = filePath.substring(filePath.indexOf('.'));
		if (extension.equals(".xlsx"))
			workbook = new XSSFWorkbook(input);
		else if (extension.equals(".xls"))
			workbook = new HSSFWorkbook(input);
	}

	public static Object[][] getExcelData(String filePath, String sheetName) throws IOException {
		FileInputStream input = new FileInputStream(filePath);
		getWorkbookInstance(filePath, input);

		// get sheet control
		int sheets = workbook.getNumberOfSheets();
		for (int i = 0; i < sheets; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase(sheetName))
				sheet = workbook.getSheetAt(i);
		}

		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(0).getPhysicalNumberOfCells();

//		System.out.println("No of Rows: " + rows + " No of Columns: " + cols);

		Object excelObj[][] = new Object[rows + 1][cols];

		for (int i = 1; i <= rows; i++) {
			for (int j = 0; j < cols; j++) {
				Cell cell = sheet.getRow(i).getCell(j);
				excelObj[i][j] = Objects.isNull(cell) ? null : getCellDate(cell);
			}
		}
		workbook.close();
		input.close();
		return excelObj;

	}

	public static void setExcelData(String filePath, String sheetName, int rowNum, int colNum, String value)
			throws IOException {

		FileInputStream input = new FileInputStream(filePath);
		getWorkbookInstance(filePath, input);

		if (Objects.isNull(workbook.getSheet(sheetName)))
			sheet = workbook.createSheet(sheetName);
		else
			sheet = workbook.getSheet(sheetName);

		if (Objects.nonNull(sheet.getRow(rowNum))) {
			row = sheet.getRow(rowNum);
		} else {
			row = sheet.createRow(rowNum);
		}

		row.createCell(colNum).setCellValue(value);
		FileOutputStream output = new FileOutputStream(filePath);
		workbook.write(output);

		workbook.close();
		input.close();
		output.close();
		output.flush();

	}

	public static void getEmployeeData(String filePath, String sheetName, List<WebElement> totalColumn,
			List<WebElement> totalRows, List<WebElement> rowValue) throws IOException {
		int no = 0;
		for (int i = 0; i < totalRows.size(); i++) {
			String value = "";
			for (int j = 0; j < totalColumn.size(); j++) {

				if (i == 0) {
					value = totalColumn.get(j).getText();
					ExcelUtil.setExcelData(filePath, sheetName, i, j, value);
				} else if (no < rowValue.size()) {
					value = Objects.isNull(rowValue.get(no).getText()) ? null : rowValue.get(no).getText();
					ExcelUtil.setExcelData(filePath, sheetName, i, j, value);
					no++;
				}
			}
		}

	}

	private static Object getCellDate(Cell cell) {

		switch (cell.getCellType()) {
		case NUMERIC:
			return cell.getNumericCellValue();
		case STRING:
			return cell.getStringCellValue();
		case BOOLEAN:
			return cell.getBooleanCellValue();
		case ERROR:
			return cell.getErrorCellValue();
		case FORMULA:
			return cell.getCellFormula();
		case BLANK:
			return null;
		default:
			return "";
		}
	}

}

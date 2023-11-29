package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.internal.invokers.TestMethodWithDataProviderMethodWorker;

import constant.FileConstants;


public class ReadExcelData {

	public static String[] readLoginTestData(int row) throws InvalidFormatException, IOException {
		
		XSSFWorkbook loginWorkbook = new XSSFWorkbook(new File(FileConstants.LOGIN_TESTDATA_FILE_PATH));
		XSSFSheet loginInfo = loginWorkbook.getSheet("testdata");
		XSSFRow rows = loginInfo.getRow(row);
		String[] strData = new String[rows.getLastCellNum()]; 
		for(int ro = row; ro <= rows.getLastCellNum(); ro++) {
			strData[ro] = rows.getCell(ro+1).getStringCellValue();
		}
		return strData;
		
	}

	
//	@DataProvider(name="testdata") 
//	public String[][] getExcelData(Method m) throws EncryptedDocumentException, IOException {
//		
//		String excelSheetName = m.getName();
////		File f = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\testData\\testdata.xlsx");
//		File f = new File(FileConstants.LOGIN_TESTDATA_FILE_PATH);
//		FileInputStream fis = new FileInputStream(f);
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sheetName = wb.getSheet(excelSheetName );
//		
//		int totalRows = sheetName.getLastRowNum();
//		System.out.println(totalRows);
//		Row rowCells = sheetName.getRow(0);
//		int totalCols = rowCells.getLastCellNum();
//		System.out.println(totalCols);
//		
//		DataFormatter format = new DataFormatter();
//		
//		String testData[][] = new String[totalRows][totalCols];
//		for(int i = 1; i <= totalRows; i++) {
//			for(int j = 0; j < totalCols; j++) {
//				testData[i-1][j] = format.formatCellValue(sheetName.getRow(i).getCell(j));
//				System.out.println(testData[i-1][j]);
//			}
//		}
//		return testData;
//	}
}

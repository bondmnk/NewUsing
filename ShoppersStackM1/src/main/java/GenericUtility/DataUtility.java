package GenericUtility;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataUtility {
	public String fetchingPropertiesFileData(String key)  throws IOException {
		File file1 =new File("./src/test/resources/TestData/Propertyfile.properties");
		FileInputStream fis = new FileInputStream(file1);
		Properties pro1 = new Properties();
	pro1.load(fis);
		String value=pro1.getProperty(key);
		return value;
	}
	
	public String fetchingExelFileDataString(String sheetname,int rowNum,int cellNum) throws Throwable  {
		
		File file =new File("C:\\Users\\91963\\Documents\\my\\PersonalData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rowNum);
		Cell cell=row.getCell(cellNum);
		String value=cell.getStringCellValue();
		return value;
	}
	
   public long fetchingExelFileDataNumeric(String sheetname,int rowNum,int cellNum) throws Throwable{
		
		File file =new File("C:\\Users\\91963\\Documents\\my\\PersonalData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rowNum);
		Cell cell=row.getCell(cellNum);
		 long value=(long)cell.getNumericCellValue();
		return value;
	}

   public boolean fetchingExelFileDataBoolean(String sheetname,int rowNum,int cellNum) throws Throwable{
		
		File file =new File("C:\\Users\\91963\\Documents\\my\\PersonalData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rowNum);
		Cell cell=row.getCell(cellNum);
		 boolean value=cell.getBooleanCellValue();
		return value;
	}
   
   public String fetchingExelFileDataDate(String sheetname,int rowNum,int cellNum) throws Throwable{
		
		File file =new File("C:\\Users\\91963\\Documents\\my\\PersonalData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rowNum);
		Cell cell=row.getCell(cellNum);
		 String value=cell.getDateCellValue().toString();
		return value;
	}
	
   
   
   
	
}

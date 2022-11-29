package com.ict.tms.auto.util;

import java.io.FileInputStream;
import java.util.logging.Logger;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	
	private static final Logger LOGGER = Logger.getLogger(ExcelUtil.class.getName()); 
	
	private static XSSFWorkbook excelBook;
	
	private static XSSFSheet excelSheet;
	
	public static String getCellData(int rowNum, int colNum) {
		
		String cellValue = null;
		
		try(FileInputStream excelFile = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/testData.xlsx")){
		
			excelBook = new XSSFWorkbook(excelFile);
			excelSheet = excelBook.getSheetAt(0);
			cellValue = excelSheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cellValue;
		
	}
	

}

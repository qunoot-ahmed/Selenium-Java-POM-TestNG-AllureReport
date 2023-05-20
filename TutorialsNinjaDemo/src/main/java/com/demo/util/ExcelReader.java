package com.demo.util;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.demo.testbase.TestBase;

public class ExcelReader {

	//finds the number of excel sheets:
	private static XSSFSheet mSheet;
	
	TestBase testbase;
	
	public ExcelReader() {
		
	}
	
	public void readExcelFile() {
		testbase = new TestBase();
		
		if(mSheet != null) {
			return;
		}
		
		File src = new File(testbase.getExcelPath());
		
		try {	
			//read the file and decode the characters
			FileInputStream file = new FileInputStream(src);	
			
			//read & write excel sheets, files, and properties
			XSSFWorkbook wb = new XSSFWorkbook(file);
			mSheet = wb.getSheetAt(0);
			
		} catch(Exception ex) {
			System.out.println("You got: "+ex);
		}	
	}
	
	private static XSSFWorkbook XSSFWorkbook(FileInputStream file) {
		return null;
	}

	public String GetCellValue(int row, int column) {
		if (mSheet == null) {
			return "";
		}
		
		XSSFCell cell = mSheet.getRow(row).getCell(column);
		return cell.getStringCellValue();
		
	}

}

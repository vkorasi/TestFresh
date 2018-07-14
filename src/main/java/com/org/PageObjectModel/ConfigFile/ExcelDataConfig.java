package com.org.PageObjectModel.ConfigFile;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//Creating own library to read excel sheet data
public class ExcelDataConfig {

	FileInputStream fins;
	HSSFWorkbook  wb;
	HSSFSheet  sheet;
	
	public ExcelDataConfig(String excelPath)
	{
		try {
			File srcFile = new File(excelPath);
			//Load the file
			fins=new FileInputStream(srcFile);
			//Load the WorkBook
			wb = new HSSFWorkbook (fins);
			//get the sheet which you want to modify or create
			
		} catch (Exception e) 
		{
			
			System.out.println(e.getMessage());
		} 
	}


	public String getData(int sheetNumber,int row,int column)
	{
		sheet = wb.getSheetAt(sheetNumber);
		String data = sheet.getRow(row).getCell(column).getStringCellValue();
		return data;
	}
}
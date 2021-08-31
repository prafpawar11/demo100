package com.UtilsLayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	
	public ExcelReader(String excelPath)
	{
		File f=new File(excelPath);
		try {
			FileInputStream fis=new FileInputStream(f);
			workbook=new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getData(int sheetIndex, int row, int column)
	{
		sheet=workbook.getSheetAt(sheetIndex);
		String data=sheet.getRow(row).getCell(column).getStringCellValue();
		return data;
	}
	
	public int totalRowsInSheet(int sheetIndex)
	{
		int rows=workbook.getSheetAt(sheetIndex).getLastRowNum();
		rows=rows+1;
		return rows;
	}

	
}

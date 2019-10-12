package org.resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.stepdefinition.HookClass;

public class Base {
		public static void  launch(String url) {
        HookClass.driver.get(url); 
	}
	public static void search(WebElement w,String s){
		w.sendKeys(s);
		
	}
	public static void click(WebElement w) {
		w.click();
	}
	public static void jexecuter(WebElement rad) {
		JavascriptExecutor jk=(JavascriptExecutor)HookClass.driver;
		jk.executeScript("arguments[0].click()", rad);
	}
	public static List<HashMap<String,String>> readValues() throws Exception {
		List<HashMap<String,String>> mapdatalist=new ArrayList<HashMap<String,String>>();
		File loc=new File("C:\\Users\\sM\\eclipse-workspace\\venkii\\Selenium\\target\\New Microsoft Excel Worksheet.xlsx");
		FileInputStream stream=new FileInputStream(loc);
		Workbook w=new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Sheet1");
		Row headerrow = s.getRow(0);
		for(int i=1;i<s.getPhysicalNumberOfRows();i++) {
			Row eachrow = s.getRow(i);
			HashMap<String,String>mp=new HashMap<String,String>();
			for(int j=1;j<eachrow.getPhysicalNumberOfCells();j++) {
				Cell eachcell = eachrow.getCell(j);
				int celltype = eachcell.getCellType();
				if(celltype==1) {
					mp.put(headerrow.getCell(j).getStringCellValue(), eachcell.getStringCellValue());
				}
				else {
						mp.put(headerrow.getCell(j).getStringCellValue(),String.valueOf(eachcell.getNumericCellValue()));
						
						
					}
				mapdatalist.add(mp);
				}
			
			
			}
		return mapdatalist;
		
		
		
		}
		
	}
	



package b6.JXLDemo;

import java.io.File;

import jxl.Workbook;

public class ReadFile {

	public static void main(String[] args) throws Exception{
		
		File src=new File("F:\\Selenium Video- Mukesh Otwani\\Mukesh-Otwani 05\\jxl.jar\\jxldemo.xls");
		System.out.println("Excel File Located");
		
		Workbook wb=Workbook.getWorkbook(src);
		System.out.println("Define the workbook");
		
		String data=wb.getSheet(0).getCell(0, 0).getContents();
		System.out.println("Set the sheet with row number & Cell number");
		
		System.out.println("The Value is :"+data);
		
		
	}

}

package b9.DataDriven;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utility {

	FileInputStream fis;
	
	XSSFWorkbook wb;
	
	public Utility(String path){
		
		try{
		
		File src=new File(path);
		
		fis=new FileInputStream(src);
		
		wb= new XSSFWorkbook(fis);
		
		}catch(Exception e){
			
			System.out.println(e.getMessage());
		}
		
	}
	
	
	public int sheetNumber(int number){
		
		int row=wb.getSheetAt(number).getLastRowNum();
		
		return row;
	}
	
	
	public String getData(int sheetnumber,int rownumber,int cellnumber){
		
		String st=wb.getSheetAt(sheetnumber).getRow(rownumber).getCell(cellnumber).getStringCellValue();
		
		return st;
	}
	
}

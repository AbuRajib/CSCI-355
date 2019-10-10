package b7.ApachePOIDemo;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LibraryFile 
{
	FileInputStream fis;
	
	XSSFWorkbook wb;
	
	public LibraryFile(String path) throws Exception{
		
		try{
			
			File src=new File(path);
			
			fis=new FileInputStream(src);
			
			wb=new XSSFWorkbook(fis);
			
		}catch(Exception e){
			
			System.out.println(e.getMessage());
			
		}
			
	}
	
	public String getValue(int sheetnumber,int rownum,int cellnum){
		
		String data=wb.getSheetAt(sheetnumber).getRow(rownum).getCell(cellnum).getStringCellValue();
		
		return data;
	}
	
	
}

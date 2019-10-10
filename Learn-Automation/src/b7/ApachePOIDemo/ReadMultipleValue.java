package b7.ApachePOIDemo;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadMultipleValue {

	public static void main(String[] args) throws Exception {


		File src=new File("F:\\Selenium Video- Mukesh Otwani\\Mukesh-Otwani 05\\poi-bin-3.15-20160924\\poiDemo.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		int row=wb.getSheetAt(0).getLastRowNum();
		
		for(int i=0;i<=row;i++){
			
			String value=wb.getSheetAt(0).getRow(i).getCell(0).getStringCellValue();
			
			System.out.println("The value " +i+" is "+value);
		}
		
		wb.close();
	}

}

package b7.ApachePOIDemo;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadSingleValue {

	public static void main(String[] args) throws Exception {
		
		File src=new File("F:\\Selenium Video- Mukesh Otwani\\Mukesh-Otwani 05\\poi-bin-3.15-20160924\\poiDemo.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		String value=wb.getSheetAt(0).getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(value);
		
		wb.close();
		
	}

}

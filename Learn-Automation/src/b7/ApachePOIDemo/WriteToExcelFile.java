package b7.ApachePOIDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcelFile {

	public static void main(String[] args) throws Exception {

		File src=new File("F:\\Selenium Video- Mukesh Otwani\\Mukesh-Otwani 05\\poi-bin-3.15-20160924\\poiDemo.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		wb.getSheetAt(0).getRow(2).createCell(2).setCellValue("FAIL");
		
		FileOutputStream fout=new FileOutputStream(src);
		
		wb.write(fout);
		
		wb.close();
	}

}

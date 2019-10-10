package b7.ApachePOIDemo;

public class ReadFromLibrary {

	public static void main(String[] args) throws Exception {
		
		LibraryFile lib=new LibraryFile("F:\\Selenium Video- Mukesh Otwani\\Mukesh-Otwani 05\\poi-bin-3.15-20160924\\poiDemo.xlsx");

		String value=lib.getValue(0, 0, 0);
		
		System.out.println(value);
	}

}

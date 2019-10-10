package practice;

public class ExceptionCase {

	public static void main(String[] args) {
		
		int[] x={1,2,3,4,5};
		
		try{
		System.out.println(x[10]);
		}catch(Exception e){
			System.out.println("This is Something Wrong!!");
		}finally{
			System.out.println("After Execute of Try & Catch Block");
		}
	}

}

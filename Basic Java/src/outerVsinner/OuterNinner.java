package outerVsinner;

public class OuterNinner {

	public void outerMethod(){
		
		System.out.println("Outer Method");
		
		innerclass in=new innerclass();
		in.innerMethod();
	}
	
	public class innerclass{
		
		public void innerMethod(){
			System.out.println("Inner Method");
		}
		
	}



}




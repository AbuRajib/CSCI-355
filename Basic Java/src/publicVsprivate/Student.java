package publicVsprivate;

public class Student {
	
	public void studentinfo(){
		
		System.out.println("Name: David");
		studentCourse();
	}

	private void studentCourse(){
		System.out.println("Course: Java");
	}
	


	public static void main(String arg[]){
		
		Student pp=new Student();
		pp.studentinfo();
		pp.studentCourse();
	}

}
package oop.inheritance;

public class MainStudent extends StudentCourse{

	public static void main(String[] args) {
		
		StudentCourse st=new StudentCourse();
		st.studentName();
		st.courseTitle();
		
		courseCode();	//use extends StudentCourse to call directly
		
		
	}

}

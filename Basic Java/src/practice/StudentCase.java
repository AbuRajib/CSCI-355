package practice;

public class StudentCase {

	//Call the Method
	//Passing the Parameters
	//Return Values
	public void Studentname(){
		System.out.println("Name of the Student: John");
	}
	
	public void Studentaddress(String address){
		System.out.println("Address: "+address);
	}
	
	static int examnumber(int x,int y){
		int z=x+y;
		return z;
	}

	
	
	public static void main(String[] args) {
		//System.out.println(examnumber(10,20));    //Static method call without create object but public method not 
		StudentCase stcase=new StudentCase();
		stcase.Studentname();
		stcase.Studentaddress("Queens, NY");
	//	System.out.println("Final Exam Number: "+stcase.examnumber(40,50));

	}

}

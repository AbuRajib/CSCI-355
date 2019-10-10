package oop.Encapsulation;

public class MainMethod {

	public static void main(String[] args) {
		
		StudentInfo info = new StudentInfo();
		info.setName("John");
		info.setId(101);
		
		System.out.println(info.getName());
		System.out.println(info.getId());
	}

}

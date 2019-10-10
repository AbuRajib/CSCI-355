package oop.Abstraction;

public class ExtendStudent extends StudentCourse implements StudentInfo{

	@Override
	public void studentname() {
		System.out.println("Student Name: John");
	}

	@Override
	public void studentaddress() {
		System.out.println("Student Address: Queens, NY");
	}

	@Override
	void courseCode() {
		System.out.println("Course Code: CSCI 331");
	}

}

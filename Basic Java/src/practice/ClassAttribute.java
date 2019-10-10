package practice;

public class ClassAttribute {

	//create a class
	//create an object
	//Attribute
	//Accessing attribute
	//Modify Attribute & override existing value
	//Final attribute
	
	int x=5;	//create an attribute
	final int y=5; //final attribute-cannot modify
	public static void main(String arg[]){
		
		ClassAttribute att=new ClassAttribute();	//create an object
//		att.x=10;			//Modify Attribute
		att.x=50;			//override existing value
		System.out.println(att.x);					//Accessing attribute
		
		
	}
	
}

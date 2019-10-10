package oop.Polymorphism;

public class MainSum {

	public static void main (String arg[]){
		ExtendsSum value=new ExtendsSum();
		System.out.println(value.sum(5, 5));
		
		SumValues value1=new SumValues();
		System.out.println(value1.sum(5, 5));
	}
}

package javaCollection;
import java.util.Vector;

public class A3_Vector {

	public static void main(String[] args) {
		
		Vector<String> list=new Vector<String>();
		list.add("A");
		list.add("B");
		list.add("B");
		
	//	System.out.println(list.capacity());
		
		for(String st:list){
			System.out.println(st);
		}
	}

}

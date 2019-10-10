package javaCollection;
import java.util.ArrayList;

public class A1_arraylist {

	public static void main(String[] args) {
		//Arraylist, Linkedlist,Vector, Stack
		ArrayList<String> list=new ArrayList<String>();
		list.add("New York");
		list.add("New Jearsy");
		list.add("Boston");
		
		for(String st:list){
			System.out.println(st);
		}
		
	}

}

package javaCollection;
import java.util.Iterator;
import java.util.LinkedList;

public class A2_LinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> list=new LinkedList<String>();
		list.add("New York");
		list.add("New Jearsy");
		list.add("Boston");
		
/*		for(String st:list){
			System.out.println(st);
		}
*/
		Iterator<String> it=list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}

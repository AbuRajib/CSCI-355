package javaCollection;

import java.util.Deque;
import java.util.LinkedList;

public class A6_Deque {

	public static void main(String[] args) {
		
		Deque<String> list=new LinkedList<String>(); 
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.peek());
		System.out.println(list.peekFirst());
		System.out.println(list.peekLast());
		list.removeFirst();
		System.out.println(list.poll());
		
	}

}

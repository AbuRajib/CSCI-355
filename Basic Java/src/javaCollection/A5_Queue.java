package javaCollection;
import java.util.Queue;
import java.util.LinkedList;

public class A5_Queue {

	public static void main(String[] args) {
		//Queue (FIFO), Deque (FIFO,LIFO)
		Queue<String> list=new LinkedList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		
	//	System.out.println(list.peek());
	//	System.out.println(list.poll());
	//	list.remove();
		System.out.println(list.peek());
	}

}

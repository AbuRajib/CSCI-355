package javaCollection;

import java.util.LinkedHashSet;

public class A8_LinkedHashSet {

	public static void main(String[] args) {
		
		LinkedHashSet<String> st=new LinkedHashSet<String>();
		
		st.add("A");
		st.add("B");
		st.add("A");
		
		for(String x:st){
			System.out.println(x);
		}
	}

}

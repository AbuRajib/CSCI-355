package javaCollection;

import java.util.HashSet;

public class A7_HashSet {

	public static void main(String[] args) {
		//HashSet, LinkedHashSet, Treeset (duplicate value cannot be store)
		
		HashSet<String> st=new HashSet<String>();
		
		st.add("A");
		st.add("B");
		st.add("A");
		
		for(String x:st){
			System.out.println(x);
		}
	}

}

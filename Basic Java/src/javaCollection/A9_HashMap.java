package javaCollection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class A9_HashMap {

	public static void main(String[] args) {
		//HashMap(Random), LinkedHashmap (Sorted), TreeMap
		
		LinkedHashMap<String,String> list=new LinkedHashMap<String,String>();
		list.put("NewYork", "Queens");
		list.put("Illonas", "Chicago");
		list.put("Bangladesh", "Chittagong");
		list.put("UK", "London");
		list.put("UAE", "Dubai");
		
		for(String st:list.keySet()){
			System.out.println(st+"---------------->"+list.get(st));
			}
	} 

}

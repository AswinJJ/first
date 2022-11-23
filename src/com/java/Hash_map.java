package com.java;
//Hash_Map
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
public class Hash_map {
	public static void main(String[] args) {
		//to create object for map
		HashMap<String, Integer> a= new HashMap<String,Integer>();
		a.put("aswin", 24);//to add values
		a.put("murali", 23);
		a.put("praveen", 22);
		a.put("praveen", 24);
	
		System.out.println(a.get("aswin"));//to get the values of aswin
		System.out.println(a.keySet());//to get all key set
		System.out.println(a.values());//to get all values
		for (String i :a.keySet()) {// to print both key set and values in order
			System.out.println(i+" "+a.get(i));
		}
				System.out.println(a);
		Set<Entry<String, Integer>> entrySet = a.entrySet();//this method convert map into set
		System.out.println(entrySet);
	
		
	}

}

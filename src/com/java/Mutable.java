package com.java;
//Mutable
public class Mutable {
	public static void main(String[] args) {
		//to print the memory location
		//creation is like object
		StringBuilder a = new StringBuilder("Aswin");
		System.out.println(a);
		StringBuilder a1 = new StringBuilder(" J J");
		System.out.println(a.append(a1));
		System.out.println("///////////////////////////////////////////////////////////");
		//IM_MUTABLE///////////////////
		String B = "Aswin";
		System.out.println(B);
	    String B1=B.toUpperCase();
		System.out.println(B1);
	    
		
			
	}

}

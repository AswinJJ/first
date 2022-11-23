package com.java;

public class Reverse_string {
	
	public void reverse(String name) {
		String output = "";
		
		for(int i = name.length() - 1; i >= 0; i--) {
			output += name.charAt(i);
		}
		
		System.out.println(output);
	}
	
	public static void main(String[] args) {
		Reverse_string s = new Reverse_string();
		s.reverse("aswin");
		
	}
	
}
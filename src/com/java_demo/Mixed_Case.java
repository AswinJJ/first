package com.java_demo;
//upper to lower &lower to upper
public class Mixed_Case {
	public static void main(String[] args) {
		String s= "WelCOME";
		String e = "";
		String s1 = s.toUpperCase();//WELCOME
		String s2 = s.toLowerCase();//welcome
		
		
		for (int i = 0; i < s.length(); i++) {
			
			if (s.charAt(i)==s1.charAt(i)) {	
				e=e+s2.charAt(i);	
			
			}
			else {
				e=e+s1.charAt(i);	
		
			}
		}
		System.out.println(e);
		}
}



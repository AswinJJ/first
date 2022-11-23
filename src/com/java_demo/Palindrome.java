package com.java_demo;

public class Palindrome {
	static void method() {
		String output = "";
		String  name = "PAVAS";
		String out = "";
		char []a = {'A','E','I','O','U'};
		for(int i = 0; i < name.length(); i++) {
			for (char j : a) {
		    if (name.charAt(i)==j) {
		    	output += name.charAt(i);
		    }
			}
		}
		System.out.println(output);//AI
		for(int j = output.length() - 1; j >= 0; j--) {
			   out += output.charAt(j);
			}
			System.out.println(out);//IA
			if (out.equals(output)) {
				System.out.println("is  palindrome");	
			}
			else {
				System.out.println("is not palindrome");
			}
	}
	public static void main(String[] args) {
		method();
	}
}

package com.java;
//Scanner method
//import the scanner class
import java.util.Scanner;

public class Scanner_Method {//class
	public static void main(String[] args) {//main
		//scanner object
		Scanner s = new Scanner (System.in);
		//fetch the input
		System.out.println("enter the first name");
		String a = s.next();//to print the first word
		System.out.println(a);
		
		System.out.println("enter the father name");
		String b = s.nextLine();//to print the sentence
		System.out.println(b);
		
		System.out.println("enter the id");
		int c = s.nextInt();// to print the integer
		System.out.println(c);
		
		System.out.println("enter the mark");
		float d = s.nextFloat();//to print the decimal 
		System.out.println(d);
		
		System.out.println("enter the sec");
		char e = s.next().charAt(0);// to print the char
		System.out.println(e);
		
		System.out.println("enter the area");
		String f = s.next().toString();// to print the string
		System.out.println(f);
		
		System.out.println("enter the number");
		long g = s.nextLong();//to enter the long integer
		System.out.println(g);
	}


}

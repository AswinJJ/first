package com.java;
//String function
public class String_function {
	public static void main(String[] args) {
		String s = "Hello friends";
		String s3 = "   hello friends   ";
		String s2 = "hello world is good world";
		//length function
		int length = s.length();
		System.out.println(length);
		//the above function also can be written as
		System.out.println(s.length());
		//string replace
		System.out.println(s.replace("Hello", "hi"));
		//split
		String[] split = s.split(" ");
		for (String str : split) {
			System.out.println(str);
		}
		
		System.out.println(s.startsWith("H"));//starts with
		System.out.println(s.contains("l"));//contains
		System.out.println(s2.indexOf("world"));//index of
		System.out.println(s2.lastIndexOf("world"));//last index of
		System.out.println(s3.trim());//trim
		System.out.println(s.isEmpty());//empty
		System.out.println(s.substring(6));//substring
		System.out.println(s.charAt(3));//char at
	}

}

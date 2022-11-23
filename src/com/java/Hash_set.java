package com.java;
//Hash_Set
import java.util.HashSet;
public class Hash_set {
 public static void main(String[] args) {
	 //object creation for hash set
	HashSet<Object> a = new HashSet<Object>();//object data type can get any data type value as input
	a.add("aswin");//to add values
	a.add("murali");
	a.add('a');
	a.add(5);                //set dont have order
	a.add(5.6);
	a.add(1000);
	System.out.println(a);//to print as set
	for(Object i : a) {// to get one by one we use for loop
		System.out.println(i);
	}
	System.out.println(a.contains(5));//to check weather 5 is present in set 
	a.clear();//to clear all values at set
	System.out.println(a);
}
}

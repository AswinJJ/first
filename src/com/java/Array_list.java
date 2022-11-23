package com.java;
//Array_List
import java.util.ArrayList;
import java.util.Collections;
public class Array_list {
	public static void main(String[] args) {
		//object creation for array list
		ArrayList <Integer> a= new ArrayList<Integer>();//EMPTY
		a.add(56);//to add variable
		a.add(45);
		a.add(89);
		a.add(5);
		Collections.sort(a);
		System.out.println(a);
		
		
		System.out.println(a.get(0));//to get a particular index value
		a.set(0, 60);//to change the index value
		System.out.println(a.get(0));
		System.out.println("////////////////////////");
		for (int i : a) {//to get all values in given order
			System.out.println(i);
		}
		
		boolean b =a.isEmpty();//to check the list is empty or not
		System.out.println(b);
		//still there are more function in list try every think 
		
	
	}
}

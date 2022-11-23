package com.java;

import java.lang.reflect.Array;

//Arrays
public class Arrays {
	public static void main(String[] args) {
		//this concept is taken in class
		//array method with fixed length
	    int a[] = new int [5];
	    a[0]=50;
	    a[1]=60;
	    a[2]=78;
	    System.out.println(a[0]);
	    System.out.println(a[1]);
	    System.out.println(a[2]);
	    // if value is not declared it takes as zero
	    System.out.println(a[4]);
	    System.out.println("/////////////////////");
	  
	    
	    //this method is not taken in class
	    // array with infinite length
	String[] b= {"aswin","praveen","murali","kathir"};
	//array value can be changed by using index reference
	   b[2]="pavas";
	for( int i=0;i<b.length;i++) {//using for loop to print value
	    System.out.println(b[i]);
	}
	
	}
	
}



package com.java_demo;

import java.util.Arrays;

public class Ascending {
	public static void main(String[] args) {
		
		int [] arr ={5, 2, 8, 7, 1,9,1,3,6,4};
		for (int i = 0; i < arr.length; i++)   
		{  
		for (int j = i + 1; j < arr.length; j++)   
		{  
		int tmp = 0;
		    //  5       2
		if (arr[i] > arr[j])   
		{  
		tmp = arr[i];  
		arr[i] = arr[j];  
		arr[j] = tmp;  
		}  
		}  
		//prints the sorted element of the array  
		System.out.println(arr[i]);  
		}
	}
}
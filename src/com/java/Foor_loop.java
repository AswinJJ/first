package com.java;
//for loop
public class Foor_loop {
	public static void main(String[] args) {
		//for loop
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		//for each method
		String[] b= {"aswin","praveen"};
		for (String i:b) {
			System.out.println(i);
		}
		//nested for loop
    for (int i = 0; i < 3;i++) {//outer loop
    
    	for (int j = 0; j < 3;j++) {//inner loop
    		System.out.println(j);
			
		}
			
		}

	}
	
}

package com.java_demo;

public class Right_Triangle {
	public static void main(String[] args) {
		int n = 5;
		int k = 1;
		int b = 1;
		for (int i = n; i >=0 ; i--) {
			for (int j = i; j >=0; j--) {
				System.out.print(" ");
				
			}
			while (k<=b) {
				System.out.print("* ");
				k++;
			}
			System.out.println();
			k=1;
			b++;
			
			
		}
		
		
		
		
		
		
	}

}

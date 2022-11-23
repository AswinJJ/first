package com.java;

public class RightAngle {
	public void right_triangle() {
		int n = 5;
		for(int i=0; i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
        	}

	public static void main(String[] args) {
		RightAngle a = new RightAngle();
		a.right_triangle();
	}
	
}

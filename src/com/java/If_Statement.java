package com.java;
//If statement
//Scanner is imported
import java.util.Scanner;

public class If_Statement {
	//main is created
	public static void main(String[] args) {
		//scanner object
		Scanner a = new Scanner(System.in);
		float temp = a.nextFloat() ;
		
		//if statement
		if(temp<20) {
			System.out.println("its freezing");
		}//if else statement
		else if (temp<30) {
			System.out.println("its cold");
		}
		else if (temp<40){
			System.out.println("its warm");
		}//else statement
		else {
			System.out.println("its too hot");
		}
		
	}

}

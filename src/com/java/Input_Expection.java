package com.java;
//Expection_Handling
import java.util.InputMismatchException;
import java.util.Scanner;
public class Input_Expection {
	static void error() {
		while(true) {//to loop the process till get right
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number ");	
		try {//try block
			long l = s.nextLong();
			System.out.println("your num  " +l);
		     break;//if the loop is correct it exit here
			}
		catch(InputMismatchException e){//catch block
			System.out.println("In valid");	
			System.out.println("enter again");
		}
		}
	}
	public static void main(String[] args) {
		error();
	}

}

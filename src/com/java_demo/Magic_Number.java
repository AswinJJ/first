package com.java_demo;

public class Magic_Number {
	public static void main(String[] args) {
		int num = 7272;
		int op = 0;
		int oop = 0;
		while(num>0) {
		int tem = num%10;
		 op = op + tem;
		 num = num /10;
		// System.out.println(op);
		}
		
		while(op>0) {
		int temp = op%10;
		oop = oop +temp;
		op = op/10;
		//System.out.println(oop);
		}
		System.out.println(oop);
		
	}

}

package com.java;
//class variable
public class Variable1 {
	//variable is created outside the method but inside the class
	int a = 96;
	//variable called inside the method
	public void empId() {
//but if we declare with same variable name it gives priority to local variable
		//int a = 50;  if the commend line is not given the output will be 50
       System.out.println(a);
	}
public static void main(String[] args) {
	//object is created
	Variable1 b = new Variable1();
	b.empId();
}
}

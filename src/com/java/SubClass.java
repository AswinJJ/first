package com.java;
// sub Partial Abstraction
//use 'extend' word to call form other class
public class SubClass extends Partial_Abstraction {
     // click the cls which shows error and create it
	// photo is attached
	@Override
	//parameter cant be given
	public void empSec() {
		System.out.println('A');
	} 
    public static void main(String[] args) {
    	//object is created
		SubClass a = new SubClass();
		a.empId(56);
		a.empName("Aswin");
		a.empSec();
	}
}

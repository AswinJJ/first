package com.java;
// sub class
// use extends word to access other class
public class Sub_overriding extends Over_Riding {
//enter the method name then ctrl + space
	@Override
	public void empId(int id) {
		super.empId(id);
	}
	@Override
	public void empName(String name) {
		super.empName(name);
	}
	@Override
	public void empSec(char sec) {
		super.empSec(sec);
	}
	public static void main(String[] args) {
		//object is created
		Sub_overriding a = new Sub_overriding();
		a.empId(56);
		a.empName("Aswin");
		a.empSec('A');
	}

}

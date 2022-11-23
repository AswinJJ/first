package com.java;
//class is created
public class Encapsulation {
	//create as many method you need
	public void empJoinDate() {
		//public access specifier
		System.out.println("11\\10\\2022");
		//this is my method of entering date using '\'
	}
	public void empName() {
		//private access specifier
		System.out.println("Aswin");
	}
	public void empNumber() {
		//protected access specifier
		System.out.println(9677557529L);
	}
	//main is created
	public static void main(String[] args) {
		//object is created
		Encapsulation a = new Encapsulation();
		a.empJoinDate();
		a.empName();
		a.empNumber();	
	}

}

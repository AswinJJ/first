package com.java;
//Child class
//open in class
//'implement' is keyword used to access other interface
public class ThirdClass implements Full_Abstraction,SecondClass {
//override same as partial Abstraction
	@Override
	public void empId() {
		System.out.println(56);
	}
	@Override
	public void empName() {
		System.out.println("Aswin");
	}
	@Override
	public void empNum() {
		System.out.println(9677557529L);
	}
	@Override
	public void empMark() {
		System.out.println(56.24F);
	}
	public static void main(String[] args) {
		//object is created
		ThirdClass a = new ThirdClass();
		a.empId();a.empName();
		a.empNum();a.empMark();
	}
	
}

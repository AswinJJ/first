package com.java;
//Constructor
//constructor dont have 'void'
//class name and method must be same
public class Constructor {
	//non-parameterized constructor
	//only one non-parameterized constructor can be created
	public  Constructor() {
        System.out.println("kamaraj college");
	}
	//parameterized constructor
	//can be created as much as want //multiple parameter can be passed
	private  Constructor(String name,long num) {
		System.out.println(name+"\n"+num);
	}
	//error will occur while using same data type in different method
	//but no problem the result will come
	public  Constructor(int Id) {
        System.out.println(Id);
	}
	public  Constructor(int Mark) {
        System.out.println(Mark);
	}
public static void main(String[] args) {
//object creation will be different & create separate object for each method
	Constructor a = new Constructor();
	Constructor a1 = new Constructor("aswin", 9677557529L);
	Constructor a2 = new Constructor(56);
	Constructor a3 = new Constructor(45);
}
}

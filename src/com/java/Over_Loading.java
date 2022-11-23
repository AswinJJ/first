package com.java;
//polymorphism
//over loading
public class Over_Loading {//class
	
	public void data_Type(int sclId) {
		System.out.println(sclId);
	}
	
	public void data_Type(int rolnum,String name,char sec,long num) {
		// \n is for next line
		// \t is for large space
		System.out.println(rolnum +"\n" +name+"\n"+sec+"\n"+num );
		}
	
	public void data_Type(float m1,float m2,float m3,float m4) {
		System.out.println(m1+"\n"+ m2+"\t"+m3+"\n"+m4);
	}
	
	//main is created
	public static void main(String[] args) {
		// objected is created
		Over_Loading a = new Over_Loading();
		a.data_Type(56);
		a.data_Type(5, "aswin", 'A', 9677557529L);
		a.data_Type(5, 25, 18, 61);		
	}
}
	


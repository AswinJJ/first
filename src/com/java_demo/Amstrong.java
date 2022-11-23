package com.java_demo;

public class Amstrong {
	public static void main(String[] args) {
		int i =  153;
		int op =0;
		
        while (i>0) {
        	int mod =i%10;//1
    		op = op+mod*mod*mod;//153
    		i=i/10;//0
    		
    		
		}
		System.out.println(op);
		
		
	}

}

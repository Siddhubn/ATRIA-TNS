package com.atria.day2;

public class NestedIFElseDemo {

	public static void main(String[] args) {
		int a=10,b=20,c=30;
		if(a>b) 
			{if(a>c)
				System.out.println("a is the largest");
			else System.out.println("c is the largest");}
		if(b>a) {
			if(b>c)
				System.out.println("b is the largest");
			else System.out.println("c is the largest");
		}	
	}
}

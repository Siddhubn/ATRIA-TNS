package com.atria.day4.first;

public class Executor {

	public static void main(String[] args) {
		Base b1=new Base();
		
		b1.varDefault=90;
		b1.varProtected=80;
		b1.varPublic=70;
		//b1.varPrivate=60;
		
		b1.methodDefault();
		b1.methodProtected();
		b1.methodPublic();
		//b1.methodPrivate();
	}

}

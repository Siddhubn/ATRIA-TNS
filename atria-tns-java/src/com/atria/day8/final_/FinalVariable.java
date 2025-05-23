package com.atria.day8.final_;

public class FinalVariable {
	final int x=15;
	final static int Y;
	final static int Z=10;
	
	void change() {
		x=150;
		Y=100;
	}
	
	@Override
	public String toString() {
		return "FinalVariable [x=" + x + "]";
	}


	static {
		Y=140;
		Z=190;
		System.out.println("Value of Y : "+Y);
	}
	
	
}

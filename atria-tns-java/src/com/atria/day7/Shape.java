package com.atria.day7;

public abstract class Shape { //abstract class
	protected float area;
	abstract void calArea(); //abstract method
	void show() { //concrete method
		System.out.println("The area is: "+area);
	}
}

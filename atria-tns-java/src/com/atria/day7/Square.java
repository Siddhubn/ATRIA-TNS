package com.atria.day7;

public class Square extends Shape{

	private float side;
	
	public Square() {
		side=2.0f;
	}
	
	public Square(float side) {
		this.side = side;
	}

	@Override
	void calArea() {
		area=side*side;
	}
	
}

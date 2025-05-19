package com.atria.day3;

public class EncapsulationDemo {

	public static void main(String[] args) {	
		EncapsulationExample obj=new EncapsulationExample();
		obj.setAge(21);
		obj.setName("Siddharth");
		obj.setSerialNumb(53);
		
		obj.getAge();
		obj.getName();
		obj.getSerialNumb();
		
		System.out.println(obj);
	}

}

package com.atria.day3;

public class EncapsulationExample {
	private int SerialNumb;
	private String Name;
	private int age;
	public int getSerialNumb() {
		return SerialNumb;
	}
	public void setSerialNumb(int serialNumb) {
		SerialNumb = serialNumb;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "EncapsulationExample [SerialNumb=" + SerialNumb + ", Name=" + Name + ", age=" + age + "]";
	}
	
}

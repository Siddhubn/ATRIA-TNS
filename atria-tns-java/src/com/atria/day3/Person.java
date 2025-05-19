package com.atria.day3;

public class Person {
private String Name;

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

@Override
public String toString() {
	return "Person [Name=" + Name + "]";
}

}

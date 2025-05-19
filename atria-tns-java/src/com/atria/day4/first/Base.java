package com.atria.day4.first;

public class Base {
int varDefault=10;
public int varPublic=20;
//private int varPrivate=30;
protected int varProtected=80;

void methodDefault() {
	System.out.println("i am a default method");
	System.out.println("Default Variable's value: "+varDefault);
}

public void methodPublic() {
	System.out.println("i am a public method");
	System.out.println("Public Variable's value: "+varPublic);
}

/*private void methodPrivate() {
	System.out.println("i am a private method");
	System.out.println("Private Variable's value: "+varPrivate);
}*/

protected void methodProtected() {
	System.out.println("i am a protected method");
	System.out.println("Protected Variable's value: "+varProtected);
}

}

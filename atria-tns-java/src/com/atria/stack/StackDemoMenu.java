package com.atria.stack;

public class StackDemoMenu {

	public static void main(String[] args) {
		StackDemoLogics stack = new StackDemoLogics(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.displayStack();

        stack.pop();
        stack.displayStack();

        stack.peek();
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.displayStack();

        stack.pop();
        stack.pop();
        stack.displayStack();
    }
}

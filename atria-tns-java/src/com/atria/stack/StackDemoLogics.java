package com.atria.stack;

public class StackDemoLogics {
	    private int maxSize;
	    private int[] stackArray;
	    private int top;

	    public StackDemoLogics(int size) {
	        this.maxSize = size;
	        stackArray = new int[maxSize];
	        top = -1;
	    }

	    public void push(int value) {
	        if (isFull()) {
	            System.out.println("Stack is full. Cannot push " + value);
	        } else {
	            stackArray[++top] = value;
	            System.out.println("Pushed: " + value);
	        }
	    }

	    public int pop() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty. Cannot pop.");
	            return -1;
	        } else {
	            int popped = stackArray[top--];
	            System.out.println("Popped: " + popped);
	            return popped;
	        }
	    }

	    public int peek() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty. Nothing to peek.");
	            return -1;
	        } else {
	            System.out.println("Top element: " + stackArray[top]);
	            return stackArray[top];
	        }
	    }

	    public void displayStack() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty.");
	        } else {
	            System.out.print("Stack contents (top to bottom): ");
	            for (int i = top; i >= 0; i--) {
	                System.out.print(stackArray[i] + " ");
	            }
	            System.out.println();
	        }
	    }
	    
	    public boolean isEmpty() {
	        return top == -1;
	    }

	    public boolean isFull() {
	        return top == maxSize - 1;
	    }
	}

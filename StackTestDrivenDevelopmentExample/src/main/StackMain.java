package main;

import stack.StackImplementation;

public class StackMain {
	
	public static void main(String[] args) {

		StackImplementation<Integer> stack = new StackImplementation<Integer>();
		
		System.out.println(stack.isEmpty());
		
		stack.push(2);
		stack.push(21);
		stack.push(7);
		stack.push(32);
		stack.push(16);
		
		System.out.println("The stack length is " + stack.length());
		System.out.println("The top value is " + stack.peek());
		
		stack.pop();
		
		System.out.println("The top value is " + stack.peek());
		System.out.println(stack.isEmpty());
		
		System.out.println(stack.search(7));
		System.out.println(stack.search(21));
		System.out.println(stack.search(2));
		System.out.println(stack.search(32));
		System.out.println(stack.search(16));
	}
}

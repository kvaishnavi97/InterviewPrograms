package io.programs;

import java.util.Stack;

public class QueueUsingStack {

	static Stack<Integer> stack;

	public static void main(String[] args) {
		stack = new Stack<>();
		enqueue(12);
		enqueue(22);
		enqueue(82);
		dequeue();
		dequeue();
		enqueue(92);
		System.out.println(stack);

	}

	private static void dequeue() {
		stack.remove(0);
		
	}

	private static void enqueue(int i) {
		stack.push(i);
		
	}
	
	
	

}

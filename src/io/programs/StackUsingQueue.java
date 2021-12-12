package io.programs;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
	public static void main(String[] args) {
		StackUsingQueue.Stack stack=new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.pop();
		stack.printResult();

	}

	static class Stack {
		Queue<Integer> q1 = new LinkedList<>();
		Queue<Integer> q2 = new LinkedList<>();

		void push(int a) {
			 while(!q1.isEmpty()) {
				 q2.add(q1.poll());
				 
			 } 
			 q1.add(a);
			 
			 while(!q2.isEmpty()) {
				 q1.add(q2.poll());
			 }
		}
		
		void printResult() {
			System.out.println("Stack: "+q1);
		}
		
		

		int pop() {
			return q1.poll();
		}

	}

}

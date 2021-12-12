package io.programs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Vaishnavi
 *
 */
public class Practice {

	// Implement Queue using two Stacks

	public static void main(String[] args) {
		Practice.Queues queue = new Queues();
		queue.push(1);
		queue.push(2);
		queue.push(3);
		queue.pop();
		queue.printResult();

	}

	public void learn() {
		Queue<Integer> q1 = new LinkedList<Integer>();
		q1.add(12);
		q1.offer(45);
		q1.poll(); // retrieves & removes
		q1.peek(); // retrieves , but does not remove
	}

	static class Queues {
		Stack<Integer> q1 = new Stack<Integer>();
		Stack<Integer> q2 = new Stack<Integer>();

		// Function to push an element into stack using two queues.
		void push(int a) {
			q1.add(a);
		}

		void printResult() {
			System.out.println("Queue:" + q1);
		}

		// Function to pop an element from stack using two queues.
		int pop() {

			while (!q1.isEmpty()) {
				q2.push(q1.pop());
			}

			int ans = q2.pop();
			makeStack(q2);
			return ans;

		}

		private void makeStack(Stack<Integer> q2) {
			while (!q2.isEmpty()) {
				q1.push(q2.pop());
			}

		}

	}

}

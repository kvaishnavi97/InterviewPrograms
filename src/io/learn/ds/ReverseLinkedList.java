package io.learn.ds;

public class ReverseLinkedList {

	public static void main(String[] args) {

		Node node = new Node();
		node.printResult();

	}

	static class Node {
		int data;
		Node next;

		Node() {

		}

		Node(int data) {
			this.data = data;
		}

		public void printResult() {
			Node headNode = makeLList();
			System.out.print("Printing Linear Linked List:==  ");
			traverse(headNode);
			int rear = findNoElementsInList(headNode);
			int front = 0;
			// Node posNode=findNodeByPosition(headNode,1);
			// System.out.println("Pos Node: " +posNode.data);
			System.out.print("\nPrinting By reversing Linked List:==  ");
			reverseList(front, rear - 1, headNode);

			traverse(headNode);
		}

		private void reverseList(int front, int rear, Node headNode) {
			while (!(front > rear || front == rear)) {
				Node tempNode = findNodeByPosition(headNode, front);
				Node poNode = findNodeByPosition(headNode, rear);
				int data = tempNode.data;
				tempNode.data = poNode.data;
				poNode.data = data;
				front++;
				rear--;
			}

			// traverse(headNode); //O(n)
                                       
		}

		private void traverse(Node headNode) {
			Node currentNode = headNode;
			while (currentNode != null) {
				System.out.print(currentNode.data + " ");
				currentNode = currentNode.next;
			}

		}

		private int findNoElementsInList(Node headNode) {
			Node tempNode = headNode;
			int n = 0;
			while (tempNode != null) {
				n++;
				tempNode = tempNode.next;
			}
			return n;
		}

		private Node findNodeByPosition(Node headNode, int pos) {
			Node tempNode = headNode;
			for (int i = 0; i < pos; i++) {
				tempNode = tempNode.next;
			}
			return tempNode;
		}

		public Node makeLList() {
			Node node1 = new Node(10);
			Node node2 = new Node(20);
			Node node3 = new Node(30);
			Node node4 = new Node(40);
			Node node5 = new Node(50);
			Node node6=new Node(60);
			Node head = node1;
			head.next = node2;
			node2.next = node3;
			node3.next = node4;
			node4.next = node5;
			node5.next = node6;
			node6.next=null;
			return head;
		}
	}

}

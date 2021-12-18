package io.learn.ds;



/**
 * @author Vaishnavi
 * pos in code is corresponds from O, start counting from 0
 *
 */
public class CreateLinkedList {

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
			traverse(headNode);
			headNode = insertelementAtGivenPosition(headNode, 59, 0);
			traverse(headNode);
			deleteElementAtGivenPosition(headNode,2);
		}

		private void traverse(Node headNode) {
			Node currentNode = headNode;
			while (currentNode != null) {
				System.out.println(currentNode.data);
				currentNode = currentNode.next;
			}

		}
		
		private Node deleteElementAtGivenPosition(Node head,int pos) {
			if(pos==0) {
				head=head.next;
				return head;
			}
			Node prev=head;
			for(int i=0;i<pos-1;i++) {
				prev=prev.next;
			}
			
			prev.next=prev.next.next;
			return head;
			
			
		}

		private Node insertelementAtGivenPosition(Node head, int data, int pos) {
			Node newNode = new Node(data);
			if (pos == 0) {
				newNode.next = head;
				head = newNode;
				return head;
			}
			Node prev = head;
			for (int i = 0; i < pos - 1; i++) {
				prev = prev.next;

			}
			newNode.next = prev.next;
			prev.next = newNode;
			return head;

		}

		public Node makeLList() {
			Node node1 = new Node(10);
			Node node2 = new Node(20);
			Node node3 = new Node(30);
			Node head = node1;
			head.next = node2;
			node2.next = node3;
			node3.next = null;
			return head;
		}
	}

}

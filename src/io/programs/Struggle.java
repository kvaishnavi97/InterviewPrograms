package io.programs;

import java.util.HashMap;

public class Struggle {
	public static void main(String[] args) {
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		hashMap.put(null, 10);
		hashMap.put(null, 20);
		hashMap.put(null, 30);
		System.out.println(hashMap);
		Parent parent=new Child();
		
		String s="Vaishnavi";
		System.out.println(s);
		s="abc";
		System.out.println(s);
	}
}

	class Parent {
		
		 public Parent(int a, int b) {
			
		}
		 
		 Parent(){
			 
		 }

	}

	class Child extends Parent {

		 Child(int a, int b) {
			super(a, b);
			// TODO Auto-generated constructor stub
		}

		Child(){

		}

	}



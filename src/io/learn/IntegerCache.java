package io.learn;

public class IntegerCache {

	public static void main(String[] args) {
		// Example of auto-boxing, here c is a reference type
		Integer c = 128; // Compiler converts this line to Integer c = Integer.valueOf(128); 

		// Example of auto-unboxing, here e is a primitive type
		int e = c; // Compiler converts this line to int e = c.intValue();
		
		Integer d=128;
		System.out.println(c==d);
		
		Integer g=127;
		Integer h=127;
		System.out.println(g==h);
		
		
		/*
		 *  Integer Cache range is in between -128 to 127.
		 * 
		 */

	}

}



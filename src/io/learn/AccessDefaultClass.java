package io.learn;

import io.programs.*;

public class AccessDefaultClass extends ProtectedExample {
	
	public static void main(String[] args) {
		
		//System.out.println(a);
		AccessDefaultClass acc=new AccessDefaultClass();
		System.out.println(acc.a);
		long c=12;
		float var=c;  //long can be promoted to float means long should be on right side & float should be on left side
		
		
		int d=45;
		c=d;
		//c=(long) var; 
		
		
		/*ProtectedExample p=new ProtectedExample();
		System.out.println(p.a);*/
		
		
	}
	
	public static void main(String number,String number1) {
		
	}
	
	void  access() {

		System.out.println(a);
	}

}

package io.newproblems;

import java.util.ArrayList;
import java.util.List;

public class CalculateIntern {

	public static void main(String[] args) {
		
		
//		int x=5;
//		int y=0;
//		int iVal=y!=0 & x/y>0 ? 1:0;
//		System.out.println(iVal);
//		
		RefTest rfTst = new RefTest();
		//rfTst.DisplayFunct();
		System.out.println(rfTst.compute(5));
		rfTst.myfunction2();


	}
	
}

	 class RefTest {
		 
		 void myfunction2() {
			 try {
			 return;
			 }
			 catch(Exception e) {
			 System.out.println("Inside catch");
			 }
			 finally {
			 System.out.println("Inside final");
			 }
			 }
		 
		 public int compute(int n) {
			 if (n == -5)
			   return 1;
			
			 return n * compute(n-1);
	    }
		public void DisplayFunct()
		{
		List<String> list = new ArrayList<String>();
		list.add("Bob");
		list.add("Tom");
		list.add("Harry");
		for (String str : list)
		{
		//str += "InTheTown";
		str=str+"InTheTown";
		System.out.println(str);
		}
		System.out.println(list);
		}

}

package io.programs;

public class ProtectedExample {
	
	protected int a;

}

class A{
	
}

class OverloadingCalculation3{  
	  void sum(int a,int b){System.out.println("a method invoked");}  
	  void sum(int a,long b){System.out.println("b method invoked");}  
	  
	  public static void main(String args[]){  
	  OverloadingCalculation3 obj=new OverloadingCalculation3();  
	  obj.sum(20,20);//now ambiguity  
	  }  
	} 

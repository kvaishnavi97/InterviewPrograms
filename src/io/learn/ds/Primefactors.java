package io.learn.ds;

import java.util.ArrayList;
import java.util.List;

public class Primefactors {

	public static void main(String[] args) {
		
		 calculatePrimeFactors(315);

	}

	private static void calculatePrimeFactors(int n) {
		List<Integer> list=new ArrayList<Integer>();
		for(int i=2; i<=n/2;i++) {
			  if(n%i==0) {
				  checkprimeNo(i);
			  }
			  
		}
		
	}

	private static void checkprimeNo(int no) {
		
		
	}

}

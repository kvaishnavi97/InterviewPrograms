package io.programs;

import java.util.Arrays;

public class InsertionSortProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {8,4,1,5,9,2};
		sortByInseration(a);

	}

	private static void sortByInseration(int[] a) {
		int temp=0;
		for(int i=1;i<a.length-1;i++) {
			for(int j=i-1;j>=0;j--) {
				 temp=a[i];
				while(a[j]>a[i]) {
				   a[i-1]=a[j];
				   
				}
			}
		
		}
	    System.out.println(Arrays.toString(a));	
	}

}

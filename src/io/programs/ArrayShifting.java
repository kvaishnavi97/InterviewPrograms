package io.programs;

import java.util.Arrays;

public class ArrayShifting {
	
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		formArrayAfterelementShift(a,3);
	}

	private static void formArrayAfterelementShift(int[] a, int no) {
		for(int i=0;i<a.length;i++) {
			 if(a[i]==no) {
				 while(i<a.length-1) {
					 a[i]=a[i+1];
					 i++;
				 }
			 }
		}
		a[a.length-1]=0;
		System.out.println(Arrays.toString(a));
		
	}

}

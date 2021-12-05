package io.learn;

public class DasualtSm {

	public static void main(String[] args) {

		DasualtSystem ds = new DasualtSystem();
		DasualtSystem ds1 = ds;
		if (ds == ds1) {
			System.out.println("Both objects are equal");
		}

		String s1 = "Hello world";
		String s2 = new String("Hello World");
		String s3 = s2;
		
		if(s1==s2) {
			System.out.println("Both objects are equal: "+s1+"  "+s2);
		}else {
			System.out.println("not equal: "+s1+"  "+s2);
		}
		if (s2 == s3) {
			System.out.println("Both objects are equal:  "+s2+"  "+s3);
		}

	}

}

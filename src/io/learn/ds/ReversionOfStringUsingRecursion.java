package io.learn.ds;

public class ReversionOfStringUsingRecursion {

	static int i = -1;
	static StringBuilder string = new StringBuilder();

	public static void main(String[] args) {

		// calculatePrimeFactors(315);
//		 String str="a";
//		 str.concat(Character.toString('c'));
		String str = "abc";
		String s = "";

		reverse(str, s);

	}

	private static void reverse(String str, String s) {
		if (str.isEmpty()) {
			System.out.println("String:" + s);
			return;
		}

		char ch = str.charAt(0);
		string.insert(0, ch);
		System.out.println(s);
		reverse(str.substring(1), string.toString());

	}

	

}

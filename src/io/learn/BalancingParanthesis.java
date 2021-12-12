package io.learn;

import java.util.ArrayList;
import java.util.List;

public class BalancingParanthesis {

	static List<Character> lst;

	public static void main(String[] args) {
		String string = "}]{[";
		
		lst = new ArrayList<Character>();
		checkBalancedString(string);
	}

	private static void checkBalancedString(String string) {
		Character chara;
		for (int i = 0; i < string.length(); i++) {
			Character ch = string.charAt(i);

			switch (ch) {
			case '[':
				lst.add(ch);
				break;

			case '{':
				lst.add(ch);
				break;

			case '(':
				lst.add(ch);
				break;

			case '}':
				chara='{';
				if (lst.contains(chara))
					lst.remove(chara);
				else
					lst.add(ch);
				break;

			case ']':
				chara='[';
				if (lst.contains(chara))
					lst.remove(chara);
				else
					lst.add(ch);
				break;

			case ')':
				chara='(';
				if (lst.contains(chara))
					lst.remove(chara);
				else
					lst.add(ch);
				break;

			}
		}
		
		if(lst.isEmpty()) {
			System.out.println("String is balanced");
		}else {
            System.out.println("String is not balanced");			
		}

	}

}

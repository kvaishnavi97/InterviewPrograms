package io.programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class RemoveDuplicateWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "Bangalore Pune Bangalore Chennai Mumbai Pune Mumbai Mumbai";
		int value = 1;

		HashMap<String, Integer> hashmap = new LinkedHashMap<>();

		String[] st = str.split("\\s+");

		/**
		 * contribute to find out no of repeats of a given string
		 */

		for (String string : st) {
			if (hashmap.containsKey(string)) {
				hashmap.put(string, hashmap.get(string) + 1);
			} else {
				hashmap.put(string, 1);
			}
		}

		System.out.println(hashmap);

		/*
		 * for(String string: st) { hashmap.put(string,value);
		 * 
		 * }
		 * 
		 * System.out.println(hashmap);
		 */

		int max = 0;
		for (Entry<String, Integer> map : hashmap.entrySet()) {
			if (max < map.getValue())
				max = map.getValue();

			System.out.println(map.getKey());

		}

		System.out.println("Max: " + max);
		
		
		hashmap.entrySet().stream().sorted((e1,e2) -> e2.getValue().compareTo(e1.getValue())).limit(1).forEach(System.out::println);

		// sorting on the basis of key

	}

}

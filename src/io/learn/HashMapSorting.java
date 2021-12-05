package io.learn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class HashMapSorting {
	
	public static void main(String[] args) {
	     Map<Integer,String> map=new HashMap<Integer,String>();	
	     map.put(28, "Geeta");
	     map.put(12, "Minal");
	     map.put(56, "Jay");
	     
	     System.out.println(map);
	     
	     
	     //Sorting on the basis of keys
	     Map<Integer,String> treeMap=new TreeMap<Integer,String>(map);
	     System.out.println(treeMap);
	     
	     //Sorting on Keys without using TreeMap
	     
	       Map<Integer,String> tempHashMap=new LinkedHashMap<Integer,String>();
	       Set<Integer> mapKeys =map.keySet();
	       System.out.println(mapKeys);
	       mapKeys=new TreeSet<>(mapKeys);
	       System.out.println(mapKeys);
	       for(Integer key: mapKeys) {
	    	   tempHashMap.put(key, map.get(key));
	       }
	       
	       System.out.println(tempHashMap);
	       
	       
	       tempHashMap.clear();
	       
	       
//	         Collection<String> mapValues =map.values();
//	         Set<String> tempmapValues=new TreeSet<>();
//	         mapValues.forEach(v -> tempmapValues.add(v));
//	         for(String string: mapValues) {
//	        	 tempHashMap.put(map.ge, string); 
//	         }
	       
	       
	       List<Map.Entry<Integer,String>> list=new ArrayList<Map.Entry<Integer,String>>();
	       for(Map.Entry<Integer, String> entry: map.entrySet()) {
	    	      list.add(entry);
	    	      
	       }
	       
	       Collections.sort(list, (entry1,entry2) -> entry1.getValue().compareTo(entry2.getValue()));
	       
	       System.out.println(list);
	       
	       
	       map.entrySet().stream().sorted((m1,m2)-> m1.getValue().compareTo(m2.getValue())).forEach(System.out::println);
	       
	         
	       Map<Integer,String> sortedMap=map.entrySet().stream().sorted((m1,m2) -> m1.getValue().compareTo(m2.getValue())).collect(Collectors.toMap(e-> e.getKey(), e-> e.getValue()));
	       
	       
	       Map<Integer,String> sortedMapOrdered=map.entrySet().stream().sorted((m1,m2) -> m1.getValue().compareTo(m2.getValue())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2) -> e1, LinkedHashMap::new));
	       
	       
	       
	         
	         
	         
	         
	         
	       
	       
	       
	       
	     
	     
	     
	}

}

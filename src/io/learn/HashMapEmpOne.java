package io.learn;

import java.util.HashMap;
import java.util.Map;

public class HashMapEmpOne {

	public static void main(String[] args) {
		 Map<Employee,String> hashMap=new HashMap<Employee,String>();
		 
		 Employee e=new Employee(30,"Vaishnavi","Digital");
		 Employee e1=new Employee(26,"Seeta","Insurance");
		 Employee e2=new Employee(29,"Meera","Telecom");
		 Employee e3=e;
		 
		 hashMap.put(e, "Kolhapur");
		 hashMap.put(e1, "Mumbai");
		 hashMap.put(e2, "Pune");
		 hashMap.put(e3, "Bangalore");
		 
		 System.out.println(hashMap);

	}

}

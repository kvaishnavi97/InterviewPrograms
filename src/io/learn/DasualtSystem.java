package io.learn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DasualtSystem {

	public static void main(String[] args) {

        final List<String> lst=new ArrayList<String>();
        
        List list=new LinkedList();
       // lst=new ArrayList<String>();   you won't be able to modify it's reference variable
        
        lst.add("Sagar");
        lst.add("seeta");
        lst.add("meera");
        
        //If you really want an immutable list, you should use the Collections.unmodifiableList() method.
        
        final int a=10;
        //a=4;   can't be allowed
        
        
        final int[] array= {4,5,6};
        array[4]=45;
      //  array=new int[7];   not allowed

	}

}

package queue;

import java.util.*;

public class LinkedListque {
    public static void main(String[] args) {
		
    	Queue<String> qu=new LinkedList<>();
    	qu.add("A");
    	qu.add("B");
    	qu.add("C");
    	
    	System.out.println(qu);
    	qu.add("D");
    	System.out.println(qu);
    	
    	for(String q:qu) {
    		System.out.print(q+" ");
    	}
    	
    	System.out.println();
    	qu.remove();
    	System.out.println(qu);
    	
    	System.out.println(qu.peek());
	}
}

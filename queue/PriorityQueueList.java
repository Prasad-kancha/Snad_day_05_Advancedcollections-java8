package queue;

import java.util.*;

public class PriorityQueueList {
	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		
		pq.add(990);
		pq.add(80);
		pq.add(50);
		pq.add(2);
		pq.add(1);
		
		System.out.println(pq);
		
		pq.add(78);
		
		System.out.println(pq);
		System.out.println(pq.peek());
		pq.remove();
		System.out.println(pq);
	}

}

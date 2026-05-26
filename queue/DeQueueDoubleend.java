package queue;

import java.util.*;

public class DeQueueDoubleend {
   public static void main(String[] args) {
	Deque<Integer> dq=new ArrayDeque<>();
	
	dq.addFirst(20);
	dq.addLast(10);
	dq.addFirst(30);
	dq.addLast(40);
	dq.addFirst(56);
	dq.addLast(35);
	dq.addFirst(87);
	dq.addLast(24);
	
	System.out.println(dq);

	dq.removeFirst();
	dq.removeLast();
	
	System.out.println(dq);
   }
}

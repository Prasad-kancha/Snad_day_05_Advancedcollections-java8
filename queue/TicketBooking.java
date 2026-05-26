package queue;

import java.util.*;

public class TicketBooking {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	
    	Queue<String> ticketBooking=new LinkedList<>();
    	
    	while(true) {
    		System.out.println("====================Ticket Booking system==========================");
    		System.out.println("1.Add customer");
    		System.out.println("2.Server customer");
    		System.out.println("3.View next Customer");
    		System.out.println("4.Display customers");
    		System.out.println("5.Exit");
    		
    		System.out.println("Enter your choice");
    		int choice=sc.nextInt();
    		
    		switch(choice) {
    		case 1:
    			System.out.println(" Enter customer name to queue");
    			String name=sc.next();
    			ticketBooking.add(name);
    			System.out.println(name+" added into queue" );
    			break;
    		
    		case 2:
    			if(ticketBooking.isEmpty()) {
    				System.out.println("Queue is empty");
    			}else {
    				String served=ticketBooking.remove();
    				System.out.println(served + " got the ticket");
    			}
    			break;
    		case 3:
    			if(ticketBooking.isEmpty()) {
    				System.out.println("Queue is empty");
    			}else {
    				String next=ticketBooking.peek();
    				System.out.println(next +" is the next person ");
    			}
    			break;
    			
    		case 4:
    			if(ticketBooking.isEmpty()) {
    				System.out.println("Queue is empty");
    			}else {
    				System.out.println("people present in the queue are ");
    				for(String s:ticketBooking) {
    					System.out.println(s);
    					
    				}
    			}
    			break;
    		case 5:
    			System.out.println("thank you ");
    			System.exit(0);
            default:
    			
    			System.out.println("invalid choice");
                 sc.close();
    			break;
    		}
    		
    		
    		
    	}
	}
}

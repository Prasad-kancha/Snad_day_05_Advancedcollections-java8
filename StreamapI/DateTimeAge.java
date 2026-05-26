package StreamapI;

//import java.util.*;
import java.time.*;

public class DateTimeAge {
   public static void main(String[] args) {
	
	   //Scanner sc=new Scanner(System.in);
	   
	   //System.out.println("enter your date of birth");
	   
	   LocalDate dob=LocalDate.of(2000, 7, 21);
	   
	   LocalDate now=LocalDate.now();
	   
	   Period p=Period.between(dob, now);
	   
	   System.out.println("your age is "+p.getYears()+" Years"+" "+p.getMonths()+" Month"+" "+p.getDays()+" days");
	   
	  // sc.close();
   }
}

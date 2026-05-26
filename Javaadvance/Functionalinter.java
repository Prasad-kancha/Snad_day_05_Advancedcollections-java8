package Javaadvance;

//import java.util.*;

@FunctionalInterface

interface Employe{
	void great(String str);
}

public class Functionalinter {
   public static void main(String[] args) {
	
	   Employe emp=(name)->{
		   System.out.println("hello "+name);
	   };
	   emp.great("prasa");
}
}

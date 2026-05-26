package Javaadvance;

//import java.util.*;

//interface Sqr{
//	int sqr(int n); 
//
//}

interface Add{
	int sum(int a,int b,int c);
}

public class LamdaFun {
   public static void main(String[] args) {
	
//	   Sqr obj=(n)->{
//		   int res=n*n;
//		   return res;
//		};
//		System.out.println(obj.sqr(6));
	   Add obj=(a,b,c)->{
		   int adding=a+b+c;
		   return adding;
	   };
	   System.out.println(obj.sum(6, 7, 9));
}
}

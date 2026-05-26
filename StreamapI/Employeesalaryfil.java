package StreamapI;

import java.util.*;
import java.util.stream.Collectors;

class Employee{
	int id;
	String name;
	double salary;
	Employee(int id,String name,int salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
}

public class Employeesalaryfil {
    public static void main(String[] args) {
		
    	List<Employee> emp=new ArrayList<>();
    	
    	emp.add(new Employee(1,"prasad",61000));
    	emp.add(new Employee(2,"ragu",49000));
    	emp.add(new Employee(3,"ravi",78000));
    	emp.add(new Employee(4,"raju",39000));
    	
    	
    	List<Employee> newEm=
    			emp.stream()
    			.filter(e -> e.salary>50000)
    			.collect(Collectors.toList());
    	
    	for(Employee e:newEm) {
    		System.out.println(e.id+" "+e.name+" "+e.salary);
    	}
    	//System.out.println(newEm);
	}
}

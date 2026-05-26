package comparator;

import java.util.*;

class Employee{
	int id;
	String name;
	int salary;
	
	Employee(int id,String name,int salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	void display() {
		System.out.println(id+" "+name+" "+salary); 
	}
	
}

class NameComparator implements Comparator<Employee> {
	public int compare(Employee e1,Employee e2) {
		return e1.name.compareTo(e2.name);
	}
}

class SalaryComparator implements Comparator<Employee>{
	public int compare(Employee e1,Employee e2) {
		return e1.salary-e2.salary;
	}
}


public class ComparatorEmp {
	public static void main(String[] args) {
		
		ArrayList<Employee> emp=new ArrayList<>();
		emp.add(new Employee(1,"prasad",23000));
		emp.add(new Employee(2,"sai",22000));
		emp.add(new Employee(3,"zeni",20000));
		emp.add(new Employee(4,"inoske",27000));
		emp.add(new Employee(5,"tanzero",20000));
		
		//Collections.sort(emp ,new NameComparator());
		Collections.sort(emp,new SalaryComparator());
		
		for(Employee i:emp) {
			i.display();
		}
		
	}

}

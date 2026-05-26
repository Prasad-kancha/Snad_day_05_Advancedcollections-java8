package comparator;

import java.util.*;

class Employees implements Comparable<Employees>{
	int id;
	String name;
	int salary;
	Employees(int id,String name,int salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public int compareTo(Employees e) {
		return this.salary-e.salary;
	}
	void display() {
		System.out.println(id+" "+name+" "+salary); 
	}
	
}

public class ComparableEmp {
	// TODO Auto-generated method stub
    public static void main(String[] args) {
		
    	List<Employees> em=new ArrayList<>();
    	
    	em.add(new Employees(1,"prasad",23000));
    	em.add(new Employees(6,"prasad",23000));
		em.add(new Employees(2,"sai",22000));
		em.add(new Employees(3,"zeni",20000));
		em.add(new Employees(4,"inoske",27000));
		em.add(new Employees(5,"tanzero",20000));
		
		Collections.sort(em);
		
		for(Employees i:em) {
			i.display();
		}
	}

}

package StreamapI;

import java.util.*;

class User{
	int id;
	String name;
	User(int id,String name){
		this.id=id;
		this.name=name;
	}
}

public class Nullsafeusersearch {
	
	static Optional<User> findUser(List<User> users,int id){
		for(User u:users) {
			if(u.id==id) {
				return Optional.of(u);
			}
		}
		return Optional.empty();
	}
    public static void main(String[] args) {
    	
    	Scanner sc=new Scanner(System.in);
    	
    	List<User> users=new ArrayList<>();
    	 
    	users.add(new User(101,"ravi"));
    	users.add(new User(103,"sai"));
    	users.add(new User(102,"ram"));
    	
    	int id=sc.nextInt();
    	
    	Optional<User> result=findUser(users, id);
    	
    	if(result.isPresent()) {
    		User u=result.get();
    		System.out.println("user found"+u.name);
    	}else {
    		System.out.println("no user");
    	}
    	sc.close();
		
	}
}

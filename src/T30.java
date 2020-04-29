//Lists with custom types
import java.util.ArrayList;
import java.util.List;

public class T30{
	
	public static void main(String[] args) {
		User me = new User();
		me.setFirstName("Caleb");
		me.setLastName("Curry");
		
		User you = new User();
		you.setFirstName("Vinuri");
		you.setLastName("Piyathilake");
		
		List<User> users = new ArrayList<User>();
		users.add(me);
		users.add(you);
		
		System.out.println((users.get(1).getFullName()));
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
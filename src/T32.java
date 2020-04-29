//Custom types as arguments
import java.util.ArrayList;
import java.util.List;

public class T32{
	
	public static void main(String[] args) {
		String[] firstNames = {"Vinuri", "Dinomi", "Lithmi" };
		String[] lastNames = {"Piyathilake", "Gunaratne", "Perera" };
		
		
		List<User> users = new ArrayList<User>();
		
		for(int i=0;i<firstNames.length;i++) {
			
			User u = new User();
			u.setFirstName(firstNames[i]);
			u.setLastName(lastNames[i]);
			users.add(u);
		}
		
		for(User u: users) {
			System.out.println(u.getFullName());
		}
		
		T32 T = new T32();
		T.printUser(users.get(0));
		
	}
	
	public void printUser(User u) {
		System.out.println(u.getFullName());
	}
	
	
	
	
}
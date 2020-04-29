 
public class User2 {
	
	private String firstName;
	private String lastName;
	
	public void output(int times) {
	for(int i=0;i<times;i++) {
	System.out.println(firstName + " " + lastName);
	}
	
	}
	
	//getter
			public String getFullName() {
				return getFirstName() + " " + lastName;
			}
			
	//getter
	public String getFirstName() {
		return firstName.toUpperCase();
	}
	
	//setter
	public void setFirstName(String fn) {
		firstName = fn;
		//firstName = fn.strip().toLowerCase;
	}
	
	//getter
		public String getLastName() {
			return lastName.toUpperCase();
		}
		
		//setter
		public void setLastName(String ln) {
			lastName = ln;
		}
		
		public static void printUser(User2 u) {
			System.out.println(u.getFullName());
		}
		
		
}

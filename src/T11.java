//String Methods
import java.util.Scanner;
public class T11{
	
	
	public static void main(String args[]) {
		
		String x = "Vinu";
		System.out.println(x.charAt(x.length() - 1));
		
		String fullAdd = x + " Samalka";
		System.out.println(fullAdd);
		
		String z = x.concat(" Samalka");
		System.out.println(z);
		
		System.out.println(fullAdd.contains("Hey"));
		
		System.out.println(fullAdd.indexOf("Hey"));
		System.out.println(fullAdd.indexOf("Hey",3));
		
		String vin = "yummmm...my oh my chicken pot pie";
		
		System.out.printf("my",vin.indexOf("my") + 1);
		System.out.printf("\n");
		
		System.out.println(vin.lastIndexOf("my"));
		
		
	
		
		
		//More String methods
		
		String upper = "  vnuri samalka piyathilake  ";
		System.out.println(upper.toUpperCase());
		
		System.out.println(upper.toLowerCase());
		//System.out.println(upper.strip());
		//System.out.println(upper.stripLeading());
		System.out.println(upper.substring(6));
		System.out.println(upper.substring(5,8));
		//System.out.println(upper.repeat(6));
		System.out.println(upper.equals("hello"));
		
		String password = "Vinuri#";
		System.out.println("Enter the pasword:");
		Scanner scanner = new Scanner(System.in);
		String guess = scanner.nextLine();
		System.out.println(password.equals(guess));
		System.out.println(password == guess);
		
		
		//if-else
		
		/* if(password.equals(guess)) {
			
			System.out.println("Your guess was correct!!!");
			return;
		} else if("laptop".equals(guess)) 
		{
			System.out.println("second was correct");
		}else {
	
		System.out.println("jjshdj kjkk kjnk");
		
		} */
		
		
		//converts upper to lower case and tell that password is true
		
			if(password.toLowerCase().equals(guess.toLowerCase())) {
				
				System.out.println("Your guess was correct!!!");
				return;
			} else if("dinomi".toLowerCase().equals(guess.toLowerCase())) 
			{
				System.out.println("second was correct");
			}else {
		
			System.out.println("jjshdj kjkk kjnk");
			
			}
			
		
		
		
		
		
		
		scanner.close();
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
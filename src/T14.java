import java.util.Scanner;
//Loops
public class T14 {


	public static void main(String[] args) {
		/*int i = 1;
		
		while(i < 11) 
		{
			System.out.println("Iteration " + i);
			i++;
			
		} */
		
		System.out.println(" Guess the password:");
		String password = "password";
		Scanner scanner = new Scanner(System.in);
		String guess = scanner.nextLine();
		
		while(!guess.contentEquals(password)) {
			
			System.out.println(" Guess the password:");
			guess = scanner.nextLine();
			
		}
		
		
		System.out.println(" Correct password:)");
		scanner.close();
	
		

	}

}
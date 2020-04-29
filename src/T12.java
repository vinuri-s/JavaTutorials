//simple program using logical operators and if else
import java.util.Scanner;
public class T12 {
	//if-else

	public static void main(String[] args) {
		
		System.out.println("How old are you?");
		
		Scanner scanner = new Scanner(System.in);
		int age = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Cats or Dogs?");
		String animal = scanner.nextLine();
		
		if(age > 12 && !animal.equals("cats")) {
			
			System.out.println("Welcome");
		}
		
		
		
		
	scanner.close();	
	}

}

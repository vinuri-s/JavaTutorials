import java.util.Scanner;
//getting inputs
public class T2 {

	public static void main(String[] args) {
		System.out.println("1) What is your name?");
		
		//System.out.println("Hello" + args[0]); can input through terminal
		
		Scanner scanner = new Scanner(System.in);
		String name =scanner.nextLine();
		
		System.out.println("Hello " + name );
		
		String string = new String("2) How are youu?\n");
	
		String easier = string + "I'm fine";
		
		System.out.println(easier);
		
		
		scanner.close();
		
		

	}

}

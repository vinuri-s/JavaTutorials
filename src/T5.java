import java.util.Scanner;
import java.math.BigDecimal;
//Types of inputs
public class T5 {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an Integer:");
		int y = scanner.nextInt();
		System.out.println(y);
		System.out.print("Answer of y+10:");
		int a = y+10;
		System.out.println(a);
		System.out.print("Enter a Big Decimal:");
		BigDecimal money = scanner.nextBigDecimal();
		System.out.println(money);
		System.out.print("Enter a Boolean:");
		boolean x=scanner.nextBoolean();
		System.out.println(x);
		System.out.print("Enter an Integer:");
		int d = scanner.nextInt(8);//gives the output in octal
		System.out.println(d);
		
	
		scanner.close();

	}

}

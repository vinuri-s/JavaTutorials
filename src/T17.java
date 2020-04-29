import java.util.Arrays;
import java.util.Scanner;
//Arrays
public class T17
{
	
	public static void main(String[] args)
	{
		int numSet1[]; //initializing
		int[] numSet2;
		/* int[] grades = new int[10];
		grades[0] = 10;
		grades[1] = 20;
		grades[2] = 30;
		System.out.println(grades[0]);
		System.out.println(grades[1]);
		System.out.println(grades[2]);
		*/
		
		int[] grades = { 1, 3, 3, 4, 5, 6, 7, 8, 9, 10};
		grades[1]=2;
		System.out.println(grades[1]);
		
		try {
			System.out.println(grades[10]);
		} catch(Exception e) {
			System.out.println(e);
		}
		
		
		System.out.println(Arrays.toString(grades));
		
		//multidimensional arrays
		int[][] score = { {1, 3, 3}, {4, 5, 6}, {7, 8, 9}};
		System.out.println(Arrays.deepToString(score));
		System.out.println(Arrays.toString(score));//error
		
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("input the size:");
		
		int size = input.nextInt();
		int[] num1 = new int[size];

		for(int i = 0; i <size;i++) {
			
			int x = input.nextInt();
			num1[i] = x;
		}
		
	
		System.out.println(Arrays.toString(num1));
		
		input.close();

		
		
	}

	


}
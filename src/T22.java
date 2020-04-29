import java.util.Arrays;


//2D Arrays
public class T22
{
	
	public static void main(String[] args)
	{
		int[][] grades1 = new int [2][2];
		
		grades1[0][0] = 2;
		grades1[0][1] = 4;
		grades1[1][0] = 6;
		grades1[1][1] = 8;
		
		System.out.println(Arrays.deepToString(grades1));
		
		int[][] grades2 = {{10,12},{14,16}};
		
		System.out.println(grades2[0][0]);
		System.out.println(grades2[0][1]);
		System.out.println(grades2[1][0]);
		System.out.println(grades2[1][1]);
		System.out.println(Arrays.deepToString(grades2));
		
	
		
		
		
		
	}

	


}
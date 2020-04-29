import java.util.Arrays;


//2D Arrays
public class T23
{
	
	public static void main(String[] args)
	{
		
		
		int[][] grades = {{10,12,12},{2,3,4,5,5},{14,16}};
		
		System.out.println("length1 = " +  grades.length);	
		System.out.println("length2 = " + grades[1].length);
	
		for(int i=0;i<grades.length;i++) {
			for(int j=0;j<grades[i].length;j++) {
				System.out.println(grades[i][j]);
				
			}
		}
		
		
		
		
	}

	


}
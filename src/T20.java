import java.util.Arrays;
import java.util.ArrayList;

//ArraysComparing
public class T20
{
	
	public static void main(String[] args)
	{
		int[] grades1 = { 5,1,3,7,8,2,4};
		int[] grades2 = { 5,1,3,7,8,2,4};
		
		System.out.println(grades1 + " " + grades2);
		
		if(grades1 == grades2) {
			System.out.println("Equal.");
		}
		
		if(grades1.equals(grades2)) {
			System.out.println("Equals");
		}
		
		System.out.println(grades1+" "+grades2);
		 if(Arrays.equals(grades1, grades2)) {
			 System.out.println("Equals Finally:)");
		 }
		
		
//----------------------------------------------------------------------------------------------		
		grades2 = grades1;
		
		 System.out.println(grades1 + " " + grades2);

		if(grades1 == grades2) {
			System.out.println("Equal.");
		}
		
		if(grades1.equals(grades2)) {
			System.out.println("Equals");
		}
		
		System.out.println(grades1+" "+grades2);
		 if(Arrays.equals(grades1, grades2)) {
			 System.out.println("Equals Finally:)");
		 }
	
		
		
	}

	


}
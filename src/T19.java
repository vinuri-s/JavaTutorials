import java.util.Arrays;
import java.util.ArrayList;

//ArraysSorting
public class T19
{
	
	public static void main(String[] args)
	{
		int[] grades = { 5,1,3,7,8,2,4};
		Arrays.sort(grades);//doesn't make a new array, modify the existing one
		Arrays.parallelSort(grades);
		System.out.println(Arrays.toString(grades));
		
		
		
	
	
		
		
	}

	


}
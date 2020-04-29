import java.util.Arrays;
import java.util.List;

//Nested for each loop
public class T27
{
	
	public static void main(String[] args)
	{
		
		
		List<Integer> allGrades = Arrays.asList(1,2,3,4,5);
		int[] grades = new int[allGrades.size()];
		
		for(int i=0;i<allGrades.size();i++) {
			grades[i] = allGrades.get(i);
				
		}
		System.out.println(Arrays.toString(grades));
		
	}

	


}
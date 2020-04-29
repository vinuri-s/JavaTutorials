import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Sort & Reverse
public class T28
{
	
	public static void main(String[] args)
	{
		
		
		List<Integer> allGrades = Arrays.asList(1,2,3,4,5);
		Collections.sort(allGrades);
		
		
		for(int grade : allGrades) {
			
			System.out.println(grade);
		}
		
		Collections.reverse(allGrades);
		
		System.out.println();
		
		for(int grade : allGrades) {
			
			System.out.println(grade);
		}
		
		
	}

	


}
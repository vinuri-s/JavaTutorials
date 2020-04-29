import java.util.Arrays;
import java.util.List;

//For each loop
public class T25
{
	
	public static void main(String[] args)
	{
		
		
		List<Integer> grades = Arrays.asList(1,2,3,4,5,6);
		System.out.println(Arrays.toString(grades.toArray()));
		
		
		for(int grade : grades ) {
			System.out.println(grade);
			
		}
		
	}

	


}
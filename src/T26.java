import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Nested for each loop
public class T26
{
	
	public static void main(String[] args)
	{
		
		
		List<List<Integer>> allGrades = new ArrayList<List<Integer>>();
		allGrades.add(Arrays.asList(5,3,2,6,3));
		allGrades.add(Arrays.asList(65,3,12,6,37));
		allGrades.add(Arrays.asList(53,37,92,6,03));
		
		
		for(List<Integer> grades : allGrades ) {
			
			for(int grade : grades) {
				System.out.print(grade + " ");
			}
			System.out.println();
			
		}

	}

	


}
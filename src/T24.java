import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Array List
public class T24
{
	
	public static void main(String[] args)
	{
		List<Integer> grades = new ArrayList<Integer>();
		grades.add(1);
		grades.add(2);
		grades.add(3);
		grades.add(4);
		grades.add(5);
		grades.add(1,7);
		
		System.out.println(grades.get(0));
		System.out.println(grades.get(1));
		System.out.println(grades.get(2));
		System.out.println("Index = " + grades.indexOf(2));
		System.out.println("Contains 2?  " + grades.contains(2));
		
		
		//To check if the list is empty and remove the numbers until it's empty
		while(!grades.isEmpty()) {
			System.out.println(grades.remove(0));
		}
		
		List<Integer> numSet = Arrays.asList(1,2,3,4,5,6);
		System.out.println(Arrays.toString(numSet.toArray()));
		
		
		for(int i =0; i < numSet.size(); i++) {
			//numSet.set(i, numSet.get(i)*2);
			System.out.println(numSet.get(i));
		}
		
	}

	


}
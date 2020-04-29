//printing patterns using loops

public class T15{
	
	/* _____  
	 * |   /
	 * |  /
	 * | /
	 * |/
	 * 
	 */
	
	public static void main(String[] args) 
	{
		for(int i =9; i>=0; i--) {
			
			for(int k =i;k>=0;k--) {
				
				
				System.out.print(k + " ");
				
			}
			System.out.println();
			
		}
		
		System.out.println();
		
		int j =9;
		while(j>=0) {
			int m =j;
			
			while(m>=0) {
				System.out.print(m + " ");
				m--;
			} System.out.println();
			j--;
		}
		
		
		
for(int a =1; a<=9; a++) {
			
			for(int b =a;b<=a+1;b++) {
				
				
				System.out.print( b + " ");
				
			}
			System.out.println();
			
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
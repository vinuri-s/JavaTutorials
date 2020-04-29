//data types
public class T4 {


	public static void main(String[] args) {
		
		boolean isBeauty = true;
		byte a = 127;
		byte b = 'A';
		//byte c = 1234; can't do this cz it's not ASCII
		char d = 'B';
		short e = 32767; // highest number available
		//short f = 14331413; number is too big
		short f = -32768;
		int g = 43414;
		long h = 43355554666868L;
		float i = 2.5146464f;
		double j = 2.5123456;
		
		
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);
		
		//float answer = j/f; This gets an error
		double answer2 = j/f;
		
		float answer = (float) j/f;
		
		System.out.println(answer2);
		System.out.println(answer);
		

	}

}

package Collections;

public class CountCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Ashwini Reddy";
		int count = 0; 
		
		char [] ch = s.toCharArray();
		
		for(int i=0; i<ch.length; i++) {
			
			System.out.println("Printing chars: " +ch[i] + " at position " + i );
			count++; 
		}
		System.out.println("Count of chars: " + count);
	}
}
			
		

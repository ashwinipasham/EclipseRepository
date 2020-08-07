package Collections;

public class CountAllSubstr {

	//count all Substring
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "Geeks"; 
		int count = 0; 
		
		for(int i=0; i<input.length(); i++)
		//for(int i=input.length()-1; i>=0;  i--)
		{
		String n = input.substring(i); 	
		count ++; 
		System.out.println(n);
		
		}		
		
		System.out.println("Count of Substrings: " + count);
	}

}

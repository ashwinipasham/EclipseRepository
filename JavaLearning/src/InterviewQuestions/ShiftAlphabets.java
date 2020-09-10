
public class ShiftAlphabets {
	
	public static String Shift(int n, String s)
	{
		char[] ch = s.toCharArray(); 
		int count = n; 
		
		StringBuilder sb = new StringBuilder(); 
		
		for(int i=0; i<ch.length; i++)
		{		
		int ascii = (int)ch[i]; 
		ascii = ascii + count;
		char c = (char)ascii;		
		sb.append(c);				
		}
		
		String newString = sb.toString();
		
		System.out.println("The new String: " + newString);		
		return newString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shift(1, "the user"); 
		Shift(2, "Qa Tester"); 

	}

}

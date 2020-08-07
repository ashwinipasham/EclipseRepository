package JavaBasics;

public class FindAsciiValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Ashwini+()$%"; 
		
		String s1 = s.toLowerCase();
		
		for(int i = 0 ; i<s1.length(); i++)
		{
		char ch = s1.charAt(i); 
		int ascii = ch; 
		
	
		int castAscii = (int)ch; 
		System.out.println("The Ascii value of character " + ch + " = " + castAscii);
		
		//int castAscii = (int)ch - 96; 
		//System.out.println("The value of alphabets " + ch + "= " + castAscii);
		
	}
	}

}

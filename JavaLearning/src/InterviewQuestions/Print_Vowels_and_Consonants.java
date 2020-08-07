package InterviewQuestions;

public class Print_Vowels_and_Consonants {
	
	public static void findvowels_consonants(String input)
	{
		int vowelsCount =0; 
		int consonantCount =0; 
		String vowels = "aeiouy";
		
		for(int i=0; i<input.length(); i++ )
		{
			//String normalize = input.toLowerCase(); 			
			//char [] ch = input.toCharArray(); 
					
			if (vowels.contains(Character.toString(input.charAt(i)).toLowerCase()))
			{
				vowelsCount ++; 
			}
			else {
				consonantCount++; 
			}						
		}
		
		System.out.println("There are " + vowelsCount + " vowels in '" + input + "'");
		System.out.println("There are " + consonantCount + " consonants in '" + input + "'");
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * vowels: a,e,i,o,u,y 
		 * Test cases: 
		 * "HellO" - 2 Vowels, 3 Constants
		 * "there is a quiet Mouse" - 10 vowels, 8 consonants 
		 * "I am happy" - 4 vowels, 4 consonants
		 */
		
		String value = "HellO";
		// in the below string the spaces are counted as consonants
		String value1 = "there is a quiet Mouse"; 
		String value2 = "I am happy"; 
		
	findvowels_consonants(value);	
	findvowels_consonants(value1); 
	findvowels_consonants(value2);
		 
	}

}

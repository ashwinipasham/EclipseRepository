package InterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;

public class FindRepeatedLetter {

	public static void findRepeated_letter (String s)
	{
		HashMap<Character, Integer> letterMap = new HashMap<Character, Integer>(); 
		
		char MostRepeatedLetter = ' ';
		int count =0; 
		char [] letters = s.toCharArray(); 
		
		Arrays.sort(letters);
		
		//loop through letter char Array
		for(char i: letters)
		{
		if(letterMap.containsKey(i)) 
		{
			letterMap.put(i, letterMap.get(i) +1); 	
			count ++; 
			//break;
		}
		else {
			letterMap.put(i,1);
		}
		}
		
		//int maxNum = 0; 
		//loop thru the keyset
		
		//int MaxNumber = 
		for(char a:letterMap.keySet())
		{
			int currentValue = letterMap.get(a);
			if(currentValue > count)
			MostRepeatedLetter = a; 		
			 count = currentValue;
		}
		
		System.out.println("Most Repeated letter in the given word '" + s + "' has '" +
		MostRepeatedLetter + "' " + count + " times");
	}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value = "phonebook";
		String value2 = "ababacdd"; 
		//prints the last character, try to print the 
		//first character 'a' that repeats 3times
		
		
		findRepeated_letter(value); 
		findRepeated_letter(value2);
		
	}

}

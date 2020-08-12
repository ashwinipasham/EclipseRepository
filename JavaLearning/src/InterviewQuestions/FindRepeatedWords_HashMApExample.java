package InterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;


public class FindRepeatedWords_HashMApExample {

	
	public static void FindRepeated_words(String input)
	{
	
	HashMap<String, Integer> map = new HashMap<String, Integer>(); 
	//String lowercased = input.trim(); 
	 String[] wordBreak = input.split(" "); 
	 int count =0; 
	 String mostRepeatedWord ="";
	 
	 System.out.println(Arrays.toString(wordBreak));
			
	 //Iterate through wordBreak Array
			for(String words:wordBreak)
			{			
				if (words.length()>0)
				{
					//if it exists in hashmap, increment by 1
					if(map.containsKey(words))
					{
						map.put(words, map.get(words) +1);
						count++;
						break;
					}
					else {
						//if it doesn't exist put it with value 1
						map.put(words, 1); 
					}
				}
					
			}
			
			for(String key:map.keySet()) {
				int currentValue = map.get(key); 
				if(currentValue > count) {
					mostRepeatedWord = key; 
					count = currentValue; 
				}				
			}
			
			System.out.println("Most Repeated word: " + mostRepeatedWord + " is '" + count + "' times");				
			}	
				
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String value = "The governing wisdom about writing "
				+ "sentences says not to repeat Repetition is bad "
				+ "Repetition is sloppy Writers are encouraged to consult a "
				+ "thesaurus and change up that Repetition pesky offending word"; 
		
		
		 FindRepeated_words(value);
		
	}

}

package DataStructures;

import java.util.HashMap;


public class FindRepeatedWords_HashMApExample {

	
	public static void FindRepeated_words(String input)
	{
	
	//String lowercased = input.trim(); 
	 String[] wordBreak = input.split(" "); 
	 int count =0; 
			
			for(String i:wordBreak)
			{
				//System.out.println(i);
					
			HashMap<String, Integer> map = new HashMap<String, Integer>(); 
			
			String s = i; 
			
				if(map.containsKey(s))
				{
					map.put(map.get(s).toString(), +1);
					count++;
					break;
				}
				else {
					map.put(map.get(s).toString(), 1); 
				}
				
			}
			
			
			System.out.println("The repeated words are " + + count + "times");
					
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String value = "The governing wisdom about writing"
				+ "sentences says not to repeat Repetition is bad"
				+ "Repetition is sloppy Writers are encouraged to consult a"
				+ "thesaurus and change up that pesky offending word"; 
		
		
		 FindRepeated_words(value);
		
	}

}

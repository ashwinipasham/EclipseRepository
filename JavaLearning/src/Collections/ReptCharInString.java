package Collections;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

public class ReptCharInString {
	
	public static String RepeatChar(String input) {
		 
		//char[] chr = input.toCharArray();
		input = input.toLowerCase().replaceAll("\\s", "");
		
		System.out.println(input);
		
		HashMap<Character, Integer> map= new HashMap<Character, Integer>();
		for(int i =0; i<input.length(); i++)
		{
			
			if (map.containsKey(input.charAt(i)))
			{
				map.put(input.charAt(i), map.get(input.charAt(i))+1); 
			}
			else {
				map.put(input.charAt(i), 1);
			}
		}
		//Iterate through Hashmap
		for(Map.Entry<Character, Integer> entry: map.entrySet())
		{
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
				
		return input;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Starbucks Company"; 
		
		System.out.println("String:" + s);
		
		RepeatChar(s);
			
	}

}

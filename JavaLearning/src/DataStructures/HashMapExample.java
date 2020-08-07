package DataStructures;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void printFreq(int arr[])
	{
		//create an empty Hashmap
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	
		//Transverse the loop 
		for(int i =0; i<arr.length; i++)
			{
				Integer c = map.get(arr[i]); 
				
				//first occurrence
				if(map.get(arr[i]) == null)
				{
					map.put(arr[i] , 1);
				}
				
				//existing value
				
				else {
					map.put(arr[i], ++c); 
				}				
				
			}
		////print result to get the Keys (map.entrySet) and Values (map.values) to get the values
		for(Map.Entry m:map.entrySet()) 
			System.out.println("Frequency of " +m.getKey() + " is " + m.getValue());
		}
		
		//Main method to test
		public static void main (String args[]) {
			int arr[] = {10, 34, 5, 10, 2, 5, 10};
			printFreq(arr);			
		}
}

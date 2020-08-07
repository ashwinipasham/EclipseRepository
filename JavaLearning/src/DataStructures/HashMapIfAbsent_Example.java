package DataStructures;

import java.util.HashMap;

public class HashMapIfAbsent_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create an HashMap
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		//Mapping Integer values to string
		//use put method to add values 
		map.put("a", 100);
		map.put("b", 200);
		map.put("c", 300);
		map.put("e",  400);
		
		System.out.println("map Size: " + map.size());
		System.out.println("Intial map: " + map.toString());
		
		map.putIfAbsent("d", 400);
		map.replace("e", 400, 500);
		
		System.out.println("After changes hashmap: " + map.toString());

		//Put all method is used for copying the map to new map
		HashMap<String, Integer> new_map = new HashMap<String, Integer>();
		new_map.put("Ashwini", 10);
		new_map.put("Raju", 20);
		new_map.put("Arjun", 20);
		
		//replace method(key, oldvalue, newvalue)
		new_map.replace("Arjun", 20, 30);
		new_map.putIfAbsent("Nirmala", 50);
		new_map.putAll(map);
		 
		 
		 System.out.println("Final map: " + new_map);
		 System.out.println("Final map size: " + new_map.size());
			
		
		
	}

}

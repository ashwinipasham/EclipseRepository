package Collections;

import java.util.ArrayList;

public class ArrayList_StringExample {

	public static void main(String args[])
	{
		//create an empty arrayList
		ArrayList<String> arrList = new ArrayList<String>();
		
		arrList.add("Geeks");
		arrList.add("4");
		arrList.add("Geeks");
		
		System.out.println("Initial size of array: " + arrList.size());
		arrList.add(3, "for");
		arrList.add(4,"Engineers");
		//arrList.remove(2);
		
		System.out.println("Array size: " + arrList.size());
		System.out.println("List of an String array: " + arrList);
		
		
	}
}

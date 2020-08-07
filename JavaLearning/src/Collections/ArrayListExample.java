package Collections;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String args[])
	{
		//create an empty arrayList
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		arrList.add(1);
		arrList.add(2);
		arrList.add(5);
		
		System.out.println("Initial size of array: " + arrList.size());
		arrList.add(3, 8);
		arrList.add(4,10);
		arrList.remove(2);
		
		System.out.println("Array size: " + arrList.size());
		System.out.println("List of an array: " + arrList);
		
		
	}
}

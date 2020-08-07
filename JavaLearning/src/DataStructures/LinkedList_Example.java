package DataStructures;

import java.util.LinkedList;

public class LinkedList_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> ll = new LinkedList<String>(); 
		
		ll.add("Sheelly");
		ll.add("John");
		ll.add("Peter");
		ll.add("Wash");
		
		System.out.println(ll);
		
		ll.addFirst("Peter");
		ll.addLast("Victor");
		
		System.out.println(ll);
		
		ll.add(3, "5"); 
		ll.remove("Wash");
		
		System.out.println("New array: " + ll);
		
		//ll.clear(); System.out.println(ll); it will clear all values
		
		ll.clone(); System.out.println(ll);
		
		int i = ll.indexOf("John");
		
		System.out.println("Index of John: " + i );
		
		boolean haveAlex = ll.contains("Alex");
		System.out.println(haveAlex);
		
		boolean haveVictor = ll.contains("Victor");
		System.out.println(haveVictor);		
		
	}

}

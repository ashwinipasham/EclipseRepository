package DataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Example {
	
	public static void main(String args[])
	{
		Queue<String> queue = new LinkedList(); 
		
		//Enqueue  items by add() - LIFO - Last in first out
		queue.add("Shelly"); 
		queue.add("Ashley"); 
		queue.add("Bern");
		queue.add("world"); 
		queue.add("benton");
		
		System.out.println(queue);
		
		String nextInQueue = queue.peek(); 
		
		String nextInPoll = queue.poll(); 
		
		System.out.println(nextInQueue);
		
		System.out.println(nextInPoll);
		
		queue.remove("world"); 
		
		System.out.println(queue);
	}

}

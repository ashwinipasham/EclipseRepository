package DataStructures;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class PriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating empty priority Queue
		Queue<Integer> pq
        = new LinkedList<Integer>(); 
		
		pq.add(10);
		pq.add(89);
		pq.add(55);
		
		//printing top element of Queue
		System.out.println("Peek: " + pq.peek());
		
		//printing and removing the top element of queue
		System.out.println("After Poll " + pq.poll());
		
		System.out.println("Size: " + pq.size()); 
		
		pq.add(69); 
		pq.add(25); 
		
		System.out.println("Final queue: " +pq);
		
		//we can use for loop method here to print each element in queue
		Iterator<Integer> rq =  pq.iterator(); 
		
		while(rq.hasNext())
		{
		System.out.println("Iterator loop: " + rq.next() + " ");
		}
		
		pq.remove(55); 
		
		System.out.println("After remove: " + pq);
	}


}

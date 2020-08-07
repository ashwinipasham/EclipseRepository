package DataStructures;

import java.util.Stack;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Stack_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> deckofCards = new Stack<String>(); 
		
		String card1= "Jack"; 
		String card2= "Diamonds: 5"; 
		String card3= "Heart: 8"; 
		
		//pushing the items to Stack - FIFO - First In First Out 
		deckofCards.push(card1);
		deckofCards.push(card2); 
		deckofCards.push(card3); 
		
		System.out.println(deckofCards);
		
		System.out.println("Top of stack: " +deckofCards.peek()); 
		
		while(!deckofCards.empty())
		{
			String RemoveItem = deckofCards.pop();
			System.out.println("Removed Item: " + RemoveItem);
		}
		
		deckofCards.push("Queen");
		deckofCards.push("King");
		
		System.out.println(deckofCards);
		
		
		
		
		
		
		
		
		
	}

}

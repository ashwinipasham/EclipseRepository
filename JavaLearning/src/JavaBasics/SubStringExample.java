package JavaBasics;

public class SubStringExample {
	
	public static void main(String args[]) {
	
		String s = "It was the best of the best"; 
		
		String[] splitArr = s.split(" ");
		
		for(String i:splitArr) {
			System.out.println(i);
		}
	
	}
	
}

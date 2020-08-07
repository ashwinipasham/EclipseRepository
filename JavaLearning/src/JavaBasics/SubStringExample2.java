package JavaBasics;

public class SubStringExample2 {
	
	public static void main(String args[]) {
	
		String s = "How are you doing:Today, we are doing:great"; 
		
		//String[] splitArr = s.split(" "(delimeter), 3(limit));
		String[] splitArr = s.split(":");
		//: is a delimeter; 
		
		for(String i:splitArr) {
			System.out.println(i);
		}
	
	}
	
}

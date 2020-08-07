package JavaBasics;

public class StringMethodsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Hello"; 
		String s2 = "hello";
		String s3 = "example";
		
		//returns -ve when <, return +ve when >; 
		//returns 0 if equal
		System.out.println(s1.compareTo(s2)); 
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println("Substring= " + s3.substring(2));
		System.out.println("Substring= " + s3.substring(0,3));
		System.out.println("Substring= " + s3.subSequence(1, 4));
	}
	

}

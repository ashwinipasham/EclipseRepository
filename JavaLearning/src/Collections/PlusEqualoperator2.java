package Collections;

public class PlusEqualoperator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Geeks for geeks"; 
		String str2 = "Operator Testing"; 
		
		int n1 = 10; 
		n1--; 
		int n2 = 3; 
		n2++; 
		//int n3 = 5; 
		
		int n3 = n1 += n2; 
		
		System.out.println(n3);
		
		System.out.println(str1.concat(str2));
	}

}

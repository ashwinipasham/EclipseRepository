package JavaBasics;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "Ashwini"; 
		
		char[] c = input.toCharArray();
		
		StringBuilder sb = new StringBuilder(); 
		
		sb.append(c[0]); 
		
		for(int i=c.length-2; i>0; i--) {
			
			sb.append(c[i]); 
		}
		
		sb.append(c[c.length-1]); 
		
		System.out.println("Output:" + sb);
		
	}

}

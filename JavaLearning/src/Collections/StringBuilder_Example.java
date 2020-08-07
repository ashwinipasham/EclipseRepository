package Collections;

public class StringBuilder_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] s1 = {"I", "LOVE", "YOU"};
		
		StringBuilder sb = new StringBuilder();
		for(int i=s1.length-1; i>=0; i--) {
			
		sb.append(s1[i]);
		}
		
		System.out.println(sb);
		
		
	}

}

package Collections;



public class StringToCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s = "Ashwini Reddy";
		
         int count[] = new int[256];
		char [] ch = s.toCharArray();
		
		for(int i=0; i<ch.length; i++) {
			count[s.charAt(i)]++;
		}
		
		
		for(int i=0; i<ch.length; i++) {
			ch[i]=s.charAt(i);
			
			//System.out.println("Printing chars: " +ch[i]);
			int find = 0; 
			for (int j =0; j<i; j++)
			{
				if (s.charAt(i) == ch[j]) {
					find ++; 
				}			
			
			}
			
			if (find ==1);
			System.out.println("Count the characters:" + s.charAt(i) +" is-- " + count[(s.charAt(i))]);
			
		}
		
		
		
	}		

}

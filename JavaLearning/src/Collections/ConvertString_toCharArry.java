package Collections;

public class ConvertString_toCharArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Collections";
		
		//1st method to print straight using CharArray
		  char [] c = str.toCharArray();
		
		  for(char i:c) 
		  { 
			  System.out.print(i); 
		  }
		 
		//-----------------------------------------
		//2nd method to print straight using CharAt
		/*
		 * char c; for(int i=0; i<str.length(); i++) 
		 * { c= str.charAt(i);
		 * System.out.print(c); }
		 */
				 		 
		System.out.println();
		
		//to do reverse
		  for(int j=c.length-1; j>=0; j--)
		  { System.out.print(c[j]);
		  //System.out.println("Reverse string: " + c[j] +" at position " + (j)); }
		  }
	}

}

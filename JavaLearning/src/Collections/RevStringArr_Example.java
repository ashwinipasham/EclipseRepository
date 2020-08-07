package Collections;

public class RevStringArr_Example {
	
	
	  public static String[] RevStringArr(String[] strArr) {
	  
	  for(int i=0; i<strArr.length; i++)
	  {
		 char[] cArray = strArr[i].toCharArray();
		 StringBuilder sb = new StringBuilder();
		 
		 for(int j =cArray.length-1; j>=0; j--) {
			 
			 sb.append(cArray[j]);
		 }
		 
		 strArr[i] =sb.toString();
		 
	  }
	  	  
	return strArr;	  
	  }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] s = {"Ashwini", "Arjun", "Raju", "Nirmala"};
		
		//for each syntax =  variable:arrayName, print i; 
		for(String i: s) {
			System.out.print(" " + i);
		}
		
		System.out.println();
		
		RevStringArr(s);
		
		for(String k: s) {
			System.out.print(" " + k);
		}
		
		
	}

}

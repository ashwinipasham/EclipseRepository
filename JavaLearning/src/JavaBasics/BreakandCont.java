package JavaBasics;

public class BreakandCont {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		for(int i =0; i<=10; i++)
		{
			if(i>=4 && i<7)
			{
				continue;
				//Continue statements are used to skip the iteration of the loop
				//the output will be missing 5 and 6 values here.
			}
					
			  if (i==8) { 
			  break; 
			  //Break is used to break the iteration if the cond is met
			  }
			 
			
			System.out.println("Inside of the loop: " +i);
		}
		
		System.out.println("Outside of the loop: ");
	}

}

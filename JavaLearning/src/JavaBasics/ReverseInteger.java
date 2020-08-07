package JavaBasics;

public class ReverseInteger {

	public static int ReverseInteger(int x) {
		
		boolean isNegative = false; 
			if (x < 0)
			{
			x = 0 - x ; 
			isNegative = true;
			} 
        
        int r; 
        int n = x; 
        int sum =0; 
     
        while(n>=1)
        {
            r = n%10; 
            sum = (sum*10)+ r; 
            n = n/10; 
        }
        
        if(isNegative)
        {
        	sum = 0-sum; 
        	 //return sum; 
        }
       // else
        
        return sum; 
        
    }
 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = -123; 
		System.out.println(ReverseInteger(input)); 
				
	}

}

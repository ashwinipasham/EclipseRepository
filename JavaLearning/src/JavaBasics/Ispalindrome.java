package JavaBasics;

public class Ispalindrome {

	 public static boolean isPalindrome(int x) {
	        
	        int r; 
	        int n = x; 
	        int sum =0; 
	        
	        while(n>=1)
	        {
	            r = n%10; 
	            sum = (sum*10)+ r; 
	            n = n/10; 
	        }
	        
	        if (x == sum){
	           return true;
	        } 
	        else
	            return false; 
	        
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 121;
		
		System.out.println(isPalindrome(input)); 
	}

}

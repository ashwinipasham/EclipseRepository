package Collections;

public class RemoveDuplicate_intExample {
	
	// Output failed to remove duplicates

	    public static int[] removeDuplicates(int[] nums) {
	    	{
	    	    if(nums.length == 0)
	    	        return nums; 
	    	    
	    	    int i=0; 
	    	    
	    	    for(int j=1; j<nums.length; j++ )
	    	        {
	    	            if(nums[j] != nums[i])
	    	        {
	    	                 i++; 
	    	        
	    	            nums[i] = nums[j]; 
	    	        }
	    	            else {
	    	            	break;
	    	            }
	    	        }
	    	    
	    	   nums[i] = i;
	    	    
	    	   return nums;
	    	}	    	
	     	}
	    
	    public static void main(String args[]) {
	    	
	    	int [] arr = {1,1,2,2,3,4}; 
	    	removeDuplicates(arr); 
	    	
	    	
	    	System.out.println(arr);
	    	
	    }
}

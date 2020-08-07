package Collections;

public class RemoveElemntsinArrya {

	    public static int removeElement(int[] nums, int val) {
	        
	        int count =0; 
	        int new_arr; 
	        for(int i=0; i<nums.length; i++)
	        {
	            if(nums[i] != val)
	            {
	            	//System.out.println(nums[i]);
	                   new_arr = nums[i];
	                   count++;	              
	            }	            
	        }
	        
	        return count; 
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {3, 2, 2, 3, 4, 5}; 
		int val = 3; 
		
		removeElement(a, val); 		
		System.out.println(removeElement(a, val));

	}

}

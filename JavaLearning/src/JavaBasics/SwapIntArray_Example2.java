/**
 * 
 */
package JavaBasics;

/**
 * @author apasham
 *
 */
public class SwapIntArray_Example2 {

	/**
	 * @param args
	 */
	public static int[] swapArr(int[] arr) 
	{
	int temp; 
	int i =0; 
	temp = arr[i]; 
	arr[i] = arr[i+1]; 
	arr[i+1] = temp; 
	
	return arr; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {10, 20}; 
		
		swapArr(nums);
		
		for(int i:nums)
		
		System.out.println(i);
		
	}

}

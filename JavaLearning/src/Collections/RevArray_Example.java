package Collections;

public class RevArray_Example {

	public static int[] RevArray(int[] arr) {
		
		for(int i=0; i<arr.length; i++)
		{
			int n = arr[i];
			int r; 
			int sum =0; 
			
			while(n>=1) {
				r = n%10; 
				sum = (sum*10) + r; 
				n = n/10;
		 
			}
			arr[i] = sum;
		}
		
		return arr;
	}
	
	public static void main (String arr[]) {
		int [] ArrayL = {2312, 1241, 1551, 2123}; 
		
		System.out.print("Intial array: {");
		for(int a=0; a<ArrayL.length; a++)
		{		
			
		System.out.print(ArrayL[a] + ",");
		}
		System.out.println("}");
		
		//Storing the values in new array
		int arr_new[] = RevArray(ArrayL); 
		
		System.out.print("Final array: {");
		for(int a=0; a<arr_new.length; a++)
		{		
		System.out.print(arr_new[a] + ",");
		}
		System.out.print("}");
		
	}
}

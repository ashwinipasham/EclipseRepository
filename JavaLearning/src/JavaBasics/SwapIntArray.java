package JavaBasics;

public class SwapIntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {10,20,30,20,40};
		int temp; 
	
		//ArrayList<Integer> arrL = new ArrayList<Integer>(); 
		for(int i=0; i<numbers.length-1; i++)
		{
			temp = numbers[i]; //10 
			numbers[i] = numbers[numbers.length-1]; //40
			numbers[numbers.length-1] = temp; //10	
		}
		
		for (int k:numbers)
		System.out.println(k);		
	}
}

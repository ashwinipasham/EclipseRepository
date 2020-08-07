package JavaBasics;

public class ArrayInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = new int [] {2,3,4,5};
		int a = 0; 
		int b = 0;
		
		for(int i =0; i<= array.length-1; i++)
		{			
		 a = array[i]; // a=2
		for(int j = 1; j<= array.length-1; j++) 
				{
			//second loop here keeps looping 3,4,5 
						b = array[j]; //b = 3,4,5
				
			int c = a+b;
				
			System.out.println("Sum of first two values: " + c);
		}
		}
		
		System.out.println();
		
	}

}

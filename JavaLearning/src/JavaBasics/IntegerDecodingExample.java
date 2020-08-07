package JavaBasics;

public class IntegerDecodingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//print the first integer to times to second integer. eg{10,5}
		// 10 values is print 5 times
		
		int[] n = {3,2,2,3,5,1, 10, 15, 20 ,100};
		
		for(int i=0; i<n.length; i++)
			{
			while(i%2 == 0)
			{
				int temp = n[i+1];
				System.out.println(n[i] + " value print " + temp + " times");
				i++; 			
			}			
			}			
		}

	}



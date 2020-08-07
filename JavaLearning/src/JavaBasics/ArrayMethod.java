package JavaBasics;

public class ArrayMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
      int[] evenNum = { 2, 24, 36, 88, 12, 14, 22, 54, 56, 92, 10 };
		int count = 0;

		for (int i = 0; i < evenNum.length; i++) {
			count = count + evenNum[i];
		}

		System.out.print("Sum of all integers = " + count);
		
//		 String[] months = {"Jan", "Feb", "March", "Apr", "May" , "Dec"}; 
//		 
//		 int leng = months.length; 
//		 
//		 System.out.println("No. of words = " + leng); 
		 
}
}

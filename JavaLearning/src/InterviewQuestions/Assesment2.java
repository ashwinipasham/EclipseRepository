package InterviewQuestions;

public class Assesment2 {
	
	public static void main(String args[])
	{
		int array[] = {1,2,3,4};
		
		//for(int i=0; i<array.size(); i++) 
		// this line will not compile because the size is not a Java function.
		for(int i=0; i<array.length; i++)
		{
			System.out.println(array[i]);
		}
	}

}

//What is the result of this program with line 9? 

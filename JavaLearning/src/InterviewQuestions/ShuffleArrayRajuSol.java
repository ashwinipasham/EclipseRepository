package InterviewQuestions;

public class ShuffleArrayRajuSol {

	public static String ShuffleArray(String s)
	{
		char[] ch = s.toCharArray(); 
		int len = s.length()/2; 
		
		if(len<=0)
		{
			return s; 
		}
		
		StringBuilder sb = new StringBuilder(); 
		for(int i=0; i<len; i++)
		{	
			
				sb.append(ch[i]); 
				sb.append(ch[i + len]); 				
		}
		
//		int i=0; 
		
		if (s.length()%2 !=0)
		{
			sb.append(ch[ch.length-1]); 
		}
		String sr = sb.toString(); 
		
		return sr; 
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "Abcdef"; 
		String input2 = "1";
		String input3 = "1234567";
		
		System.out.println(ShuffleArray(input)); 
		System.out.println(ShuffleArray(input2)); 
		System.out.println(ShuffleArray(input3)); 
		
	}

}

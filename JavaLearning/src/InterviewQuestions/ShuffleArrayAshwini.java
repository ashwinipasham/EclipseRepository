package InterviewQuestions;

public class ShuffleArrayAshwini {
	
	/*
	 * // Test Case: Divide the given string into 2 equal parts. // Shuffle the
	 * first char of 1st string and first char of 2nd string.
	 *  Eg: abcdef - divide 
	 *  abc def - 2 halfs -and now shuffle
	 *  output: adbecf
	 */	
	
	public static String ShuffleArray(String s)
		{
			char[] ch = s.toCharArray(); 
			int len = s.length()/2; 
			
			char[] new_ch1  = new char[4]; 
			char[] new_ch2 = new char[10];
			
			StringBuilder sb = new StringBuilder(); 
			
			for(int i=0; i<len; i++)
			{
				new_ch1[i] = ch[i];
				System.out.print(new_ch1[i]);
				
			}
			System.out.print("\n");
			for(int j=len; j<s.length(); j++)
			{
				new_ch2[j] = ch[j]; 
				System.out.print(new_ch2[j]);
			}
			
			sb.append(new_ch1); 
			sb.append(new_ch2);
			
			String sr = sb.toString(); 
			
			System.out.println(sb);
			return sr; 
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			String input = "Abcdef"; 
			
			ShuffleArray(input); 
			
		}

	}

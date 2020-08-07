package JavaBasics;

public class CompareEqualsTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "abc"; 
		String s2 = "abc"; 
		String s3 = "ABC";
		
		String s4 = new String("abc");
		String s5 = new String("abc");
		
		if (s1==s2) {
		System.out.println("true");
		}
		else
		{
			System.out.println(false);
		}
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2) + " becuase s1,s2 both are reference same strig constant pool");
		System.out.println(s1.equals(s3) + " because s1, s3 are case-sensitive");

		System.out.println(s1.equals(s4));
	
		System.out.println();
		
		System.out.println(s1.equals(s4));		
		System.out.println(s4 == s5);
		System.out.println(" because s4,s5 are two diff Strng objects in the heap memory");
		System.out.println(s1 == s4);
		System.out.println(" because s1 is string lateral and s4 is string object");
		
	}

}

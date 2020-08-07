package JavaBasics;

public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while --> 3 
		//for --> 4
		//do-while --> 5
		int i =0;
		int k=2;
		while (i<3)
		{
			System.out.println("While Loop " + i);
			i++;
			for(int j=1; j<4; j++)
			{
				System.out.println("For loop " + j);
				do {
					System.out.println("Do-While loop " + k);
					k++;
				}
				while(k <=5);
			}
			
			System.out.println("All loops Executed");
		}
	}

}

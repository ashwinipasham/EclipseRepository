package JavaBasics;

public class twoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rows = 3; 
		int cols = 3; 
		
		int table[][] = new int[rows][cols]; 
		
		//assign values in first row
		table[0][0] = 10;
		table[0][1] = 11;
		table[0][2] = 12;
		
		table[1][0] = 20;
		table[1][1] = 21;
		table[1][2] = 22;
		
		table[2][0] = 30;
		table[2][1] = 31;
		table[2][2] = 32;
		
		//Row length		
		System.out.println(table.length);
		
		//Col length
		System.out.println(table[0].length);
		
		
		System.out.println(table[0][2]);
		
		System.out.println("Printing 2D Array");
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++)
			{
				System.out.print(" "+table[i][j]);				
			}System.out.println(" ");
			
		}
		

	}

}

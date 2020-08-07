package JavaBasics;

public class threeDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 3;
		int b = 3;
		int c = 3;
		
		int table [][][] = new int [a][b][c];
		
		table[0][0][0] =11;
		table[0][0][1] =12;
		table[0][0][2] =13;
		
		table[0][1][0] =21;
		table[0][1][1] =22;
		table[0][1][2] =23;
		
		table[0][2][0] =31;
		table[0][2][1] =32;
		table[0][2][2] =33;
		
		table[1][0][0] =41;
		table[1][0][1] =42;
		table[1][0][2] =43;
		
		table[1][1][0] =51;
		table[1][1][1] =52;
		table[1][1][2] =53;
		
		table[2][0][0] =61;
		table[2][0][1] =62;
		table[2][0][2] =63;
		
		table[2][1][0] =71;
		table[2][1][1] =72;
		table[2][1][2] =73;
		
		table[2][2][0] =81;
		table[2][2][1] =82;
		table[2][2][2] =83;
		
		//row length
		System.out.println(table.length);
		
		//col length
		System.out.println(table[0].length);
		
		System.out.println(table[1].length);
		
		for(int i =0; i<a; i++ ) {
			for(int j =0; j<b; j++) {
				for(int k =0; k<c; k++) {
					System.out.print(" " + table[i][j][k] );
				}System.out.println(" ");
			}
		}
		
	}

}

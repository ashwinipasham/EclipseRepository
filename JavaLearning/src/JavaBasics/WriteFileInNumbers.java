package JavaBasics;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileInNumbers {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

			File f = new File("C:\\fileWriting\\mathRandomNumbers1.csv"); 
			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);
			
			for(int i=0; i<4; i++) {
				
				for(int j=0; j<3; j++){
				
				int num = (int) (Math.random()*100);
				bw.write(num+",");
			}
			}
			
			bw.close();
			fw.close();
			//System.out.println("Math file created!");
			System.out.println("CSV file created!");
			
	}

}

package JavaBasics;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Stream connectivity
		File f = new File("C:\\fileWriting\\myTextfile.txt");		
		FileWriter fw = new FileWriter(f); 
		BufferedWriter bw = new BufferedWriter(fw);
		
		
		//Writing inside the file 
		bw.write("Hello Writer Stream");
		bw.newLine();
		bw.append("Written by Ashwini Reddy Pasham");
		bw.newLine();
		bw.write("Seattle"); 
		bw.append(" ");
		bw.write("Hello title:");
		
		//Closing the file
		bw.close();
		fw.close();
	System.out.println("File created!");
		
	}

}

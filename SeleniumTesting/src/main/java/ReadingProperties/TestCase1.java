package ReadingProperties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestCase1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\apasham\\eclipse-workspace\\SeleniumTesting\\src\\main\\java\\config\\object.properties");
		prop.load(fis);
		
		System.out.println("Reading the Object properties file");
		System.out.println("--------------------");
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		System.out.println(prop.getProperty("course"));
		System.out.println(prop.getProperty("user.dir"));
		
	}

}

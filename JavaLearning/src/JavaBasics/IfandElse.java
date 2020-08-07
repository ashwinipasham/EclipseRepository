package JavaBasics;

public class IfandElse {

	public static void main(String [] args) {
		String browser = "Safari"; 
		if(browser == "Chrome") {
			System.out.println("Chrome browser launched");
		}
		else if (browser == "Firefox")
		{
			System.out.println("Firefox launched");
		}
		else if(browser == "Safari")
		{
			System.out.println("Safari launched");
		}
		else {
			System.out.println("IE browser launched");
		}
	}
}

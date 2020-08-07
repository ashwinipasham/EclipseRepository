import org.openqa.selenium.firefox.FirefoxDriver;

public class Banking {
	
	Calculator calc = new Calculator();
	

	public void profit() {
		System.out.println("Profit has been increased by 10%");
	}
	
	public void loss() {
		System.out.println("Loss has been decreased by 20%");
	}
	
	/*public void add() {
		/*
		 * Add the calc project i.e Jar file you have created from your previous company. 
		 */

	public void addSalary() {
		calc.add();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Banking b = new Banking();
		b.addSalary();
		b.profit();
		b.loss();
		
		*/
		
		FirefoxDriver driver = new FirefoxDriver(); 
		driver.get("http://way2automation.com");
		
		
		
	}

}

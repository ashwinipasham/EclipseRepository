
public class Calculator {
	
	/*
	 * class name = TheDrakNight
	 * Method name = theDarkNight
	 * 
	 * align the code= CTRL + SHIFT +F 
	 * 
	 * Object is a Super class
	 * 
	 */
	
	public Calculator() {
		/*
		 * Constructor - Method name which has the same class name is called a Consatructor
		 */
		System.out.println("Calling constructor");
	}
	
	public void add() {
		System.out.println("Add some numbers");
	}
	
	public void sub() {
		System.out.println("Sub some numbers");

	}
	
	public void mul(){
		System.out.println("Mul some numbers");
	}
	
	public void div() {
		System.out.println("Div some numbers");
	}
	
	public static void main (String args[]) {
		
		/*
		 * Calculator = new Calculator();
		 * 
		 */
		
		Calculator calc = new Calculator();
		calc.add();
		calc.div();
		calc.mul();
		calc.sub();
				
	}

}

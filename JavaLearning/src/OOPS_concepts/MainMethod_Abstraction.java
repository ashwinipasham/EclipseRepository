package OOPS_concepts;

public class MainMethod_Abstraction{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Call the Rectangle and Circle class from the same package
		//which implements Abstract Shape methods
		Rectangle r = new Rectangle("red", 10, 5); 
		Circle c = new Circle ("blue", 4);
		
		System.out.println(r.getArea());
		System.out.println(c.draw());
		
		// I'm able to call the Shape method, without creating a new object. 
		//This is the benefit of abstract class
		
		Shape s = new Circle("purple", 3); 
		System.out.println(s.getArea());
	}

}

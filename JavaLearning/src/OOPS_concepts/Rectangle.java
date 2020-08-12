package OOPS_concepts;

public class Rectangle extends Shape{
	
	double length; 
	double width; 
	
	
	//create a constructor to use the above attributes
	public Rectangle(String color, double length, double width)
	{
		//calling the Super keyword
		super(color);
		
		this.length = length; 
		this.width = width; 
	}

	@Override //Shape methods
	public double getArea() {
		// TODO Auto-generated method stub
		return length * width;
	}

	@Override
	public String draw() {
		// TODO Auto-generated method stub
		return "A " + color + " rectangle " + length + " inches long and " + 
				 + width + " inches wide is drawn.";
	}
	
	
}


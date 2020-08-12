package OOPS_concepts;

 

public class Circle extends Shape{

	double radius;
	
	public Circle (String color, double radius)
	{
		super(color);
		this.radius = radius; 
	}
	
	public double getArea() {
		
		//3.14 * r^2
		return Math.PI * Math.pow(radius, 2);
	}
	
	
	  public String draw()
	  { 
		  return "A " + color + " circle has " + radius +
	  " radius is drawn."; 
		  
	  }
	 
	
}

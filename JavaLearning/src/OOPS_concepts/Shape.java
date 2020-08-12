/**
 * 
 */
package OOPS_concepts;

/**
 * @author apasham
 *
 */
public abstract class Shape {

		String color; 
		
		//constructor for color parameter using Shape 
		public Shape(String color)
		{
			this.color = color;
		}
	
		//defining methods here, implementations in diff class. 
		abstract double getArea(); 
		abstract String draw(); 
	
}

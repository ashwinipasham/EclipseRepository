package Animals;

public class Cat extends ParentClass_Animal{
	
	// A class cannot extend two or  multiple class because
	//Java doesn't not support multiple inheritance
	
	// A class can extend only one class but implements multiple interfaces. 
	
	private String breed; 
	public String color; 

	public Cat(String name, int legs, String sounds, String breed, String color) {
		super(name, legs, sounds); 
		this.color = color; 
		this.breed = breed; 		
	}
	
	public String getBreed() {
		return breed; 
	}
}

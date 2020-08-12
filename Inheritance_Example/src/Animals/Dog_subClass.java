package Animals;

public class Dog_subClass extends ParentClass_Animal {
	
	public String color;
	public String breed; 

	public Dog_subClass(String name, int legs, String sounds, String color, String breed) {
		super(name, legs, sounds);
		// TODO Auto-generated constructor stub
		this.breed  = breed; 
		this.color = color;
	}
	
	
	
}

package Animals;

public class ParentClass_Animal {

	private String name; 
	public int legs; 
	public String sounds;
	
	public ParentClass_Animal(String name, int legs, String sounds)
	{
		this.name = name; //call the private variable 
		this.legs = legs; 
		this.sounds = sounds;
	}
	
	public String getName() {
		return name; 
	}
	
}

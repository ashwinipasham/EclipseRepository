

public class Dog extends Animal
{

	//overriding animal.Sound - for overriding the arguments should be same
	@Override
	public String Sound() {
		return "Barks!"; 
	}
	
	public String Name() {
		return "Shiny"; 
	}
}

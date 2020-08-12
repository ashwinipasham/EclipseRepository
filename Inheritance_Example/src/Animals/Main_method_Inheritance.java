package Animals;

public class Main_method_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog_subClass d = new Dog_subClass("Leko" , 4, "barks", "black", "Lab" ); 
		
		System.out.println("Name of Animal: " + d.getName());
		System.out.println("Breed: " + d.breed);
		System.out.println("No.of.legs: " + d.legs);
		System.out.println("Sounds like: " +d.sounds);
		System.out.println("Color: " + d.color);
	
		System.out.println("--------------------------------------------");
		
		Cat c = new Cat("Jaguar", 4, "growls", "WildCat", "yellow-black"); 
		System.out.println("Name of Animal: " +c.getName());
		System.out.println("Breed: " + c.getBreed());
		System.out.println("No.of.legs: " + c.legs);
		System.out.println("Sounds like: " +c.sounds);
		System.out.println("Color: " + c.color);
	}

}

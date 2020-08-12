
public class MainMethod_Poly{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal a = new Animal(); 
		Dog d = new Dog(); 
		Pig p = new Pig(); 
		
		System.out.println(a.Sound());
		System.out.println(a.Name());
		System.out.println(p.Sound());
		
		System.out.println("Dog: " + d.Name() + " " + d.Sound());
	
		
	}

}

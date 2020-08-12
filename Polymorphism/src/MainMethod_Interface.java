
public class MainMethod_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pig  p = new Pig(); 
		System.out.println("Pig: " + p.Sound() );
		System.out.print(p.eat()); 
		System.out.println(" and " + p.lives()); 
		
		System.out.println("--------------------------");
		
		Carnivores c = new Carnivores(); 
		System.out.println(c.eat());
		System.out.println(c.lives());
		 
		System.out.println("------------------");
		
		Snake s = new Snake();
		System.out.println(s.name());
		System.out.println(s.lives());
		System.out.println(s.eat());
		System.out.println(s.hatches());
	
	}

}

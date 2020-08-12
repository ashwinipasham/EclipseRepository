
public class Pig extends Animal implements Mammal{
//Mammal is a interface
	
	public String Sound() {
		return "Oinks!"; 
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "eats all dirt";
	}

	@Override
	public String lives()
	{
		// TODO Auto-generated method stub
		return "lives in sty";
	}
}

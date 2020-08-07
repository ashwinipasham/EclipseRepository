package JavaBasics;

public class doWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] list = { "eggs", "milk", "spinach", "meat", "fruits", "onions", "diapers Size 4", "DKKisses" };
		int index = 0;
		System.out.println("------------------");
		System.out.println("Costco List");
		
		do {			
			System.out.println(list[index]);
			index++;
			
		} while (index <= list.length-1);
		{
			System.out.println("------------------");
			System.out.println(" This is  a do-while loop");
		}

	}

}

package Employee;

public class MainMethod_Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Calling the Student class constructor
		Student s = new Student("Elizabeth", 25, 87532); 
		Student s1 = new Student("John", 50, 65432); 
		
		//System.out.println(s);
		
		System.out.println("Name: " + s.getName());
		System.out.println("Age: " + s.getAge());
		System.out.println("Id: " + s.getId());
		
		System.out.println("Name1: " + s1.getName());
		System.out.println("Age1: " + s1.getAge());
		System.out.println("Id1: " + s1.getId());
		
		
		
	}

}

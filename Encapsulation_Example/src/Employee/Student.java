package Employee;

public class Student {
	
	private String name; 
	private int id; 
	private int age; 

	//create a constructor with the above fields. 
	  public Student(String name, int idnum, int age)
	  { 
	 this.name = name; 
	 this.age = age; 
	 this.id = idnum;	  
	  }
	 
//create the get methods to call in the main method. 
	public String getName()
	{		
		return name;
	}
	
	public int getAge() {
		 return age; 
	}
	
	public int getId() {
		
		return id; 
	}
}

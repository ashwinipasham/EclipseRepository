package InterviewQuestions;

import java.util.ArrayList;
//import java.util.List;

public class Assessment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	     //List list = new ArrayList();  // we cannot combine list and Array together,
		//also we have to define the parameter to Array so that it stores in memory, otherwise an error message is thrown
		ArrayList<String> list = new ArrayList<String>(); 
		list.add("hello");
		list.add("2");
		
		
		System.out.println(list.get(0) instanceof Object);
		//instance of object gives the value of true or false
		//based on the index value (if the value exists it returns true, else false)
		System.out.println(list.get(1) instanceof Object);
		System.out.println(list.get(0)); // return the index value of the list
		System.out.println(list.get(1));
		
		
	}

}

//what is the output of this code? 

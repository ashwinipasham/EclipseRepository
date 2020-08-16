package vehicles;

import java.util.HashMap;

import vehicles.AvailableSpaces.VehicleSize;
import vehicles.AvailableSpaces.VehicleType;

public class MainMethod_ParkingLot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int smallRegularSpaces = 9; 
		int largeRegularSpaces = 10;
		int mediumRegularSpaces = 24;
		int handicappedRegularSpaces = 5;
		int TotalSpaces = 48; 
		
		Car c = new Car(VehicleType.REGULAR); 
		Truck t1 = new Truck(VehicleType.HANDICAPPED); 		
		
		//Output: The car has parked in Medium Regular Space. 
		//The bike has parked in handicapped space 
		//The car cannot park in handicapped space at this time, please find a regular spot 
		//Is the parking lot full? No, there are available spaces. 
		//No. of available spots left? 
		//6 medium spaces
		//2 regular spaces
		
		//MainMethod_ParkingLot park = new MainMethod_ParkingLot();
		
		ParkingSpace park1 = new ParkingSpace(c.getType(), c.getSize()); 
		//ParkingSpace park2 = new ParkingSpace(t1.getType(), t1.getSize()); 
		
		park1.setIstaken(true);
		
		//HashMap<Integer, Integer> map = new HashMap<Integer,Integer>(); 
		
		//if space occupied
		
		
		  if(park1.isSpaceOccupied()) 
		  {
			  park1.setIstaken(true);
		  TotalSpaces =TotalSpaces - 1; 
		  
		  System.out.println("No.of Available Spaces: " +TotalSpaces);
		  } 
		  else
		  { 
			  System.out.println("The parking lot is full!"); 
		   }
		 		
		
		System.out.println("The car has parked in " + c.getSize() + " " +  c.getType() + " space.");
			
		System.out.println("----------------------------");
		
		System.out.println("The truck has parked in " + t1.getSize() + " " + t1.getType() + " space");
	
		System.out.println("Is the parking lot full? " + "Nooooo....");
		
		System.out.println("No.of Spaces left: " + TotalSpaces);
		
	}

}

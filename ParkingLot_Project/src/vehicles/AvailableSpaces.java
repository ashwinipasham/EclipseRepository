package vehicles;

public interface AvailableSpaces {

	enum VehicleSize{
		MEDIUM,
		SMALL, 
		LARGE
	}
	
	enum VehicleType{
		REGULAR, 
		HANDICAPPED
	}
	
	VehicleType getType(); 
	VehicleSize getSize(); 
	
	

}
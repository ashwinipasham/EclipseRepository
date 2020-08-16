package vehicles;

public class Car implements AvailableSpaces{
	
	private VehicleType type; 
	
	public Car(VehicleType vehicleType)
	{
		this.type = vehicleType; 
	}

	@Override
	public VehicleType getType() {
		// TODO Auto-generated method stub
		return this.type;
	}

	@Override
	public VehicleSize getSize() {
		// TODO Auto-generated method stub
		return VehicleSize.MEDIUM;
	}
	
}
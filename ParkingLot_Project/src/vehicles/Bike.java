package vehicles;

public class Bike implements AvailableSpaces{
	
	private VehicleType type; 
	
	public Bike(VehicleType type)
	{
		this.type = type; 
	}

	@Override
	public VehicleType getType() {
		// TODO Auto-generated method stub
		return this.type;
	}

	@Override
	public VehicleSize getSize() {
		// TODO Auto-generated method stub
		return VehicleSize.SMALL;
	}

}

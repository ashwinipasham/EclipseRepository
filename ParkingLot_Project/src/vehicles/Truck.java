package vehicles;

public class Truck implements AvailableSpaces{
	
	private VehicleType type; 
	
	public Truck(VehicleType type)
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
		return VehicleSize.LARGE;
	}

}

package vehicles;

public class ParkingSpace implements Space {
	
	private VehicleType type; 
	private VehicleSize size; 
	private boolean isTaken; 
	
	public ParkingSpace(VehicleType type, VehicleSize size)
	{
		this.type = type;
		this.size = size;
	}

	@Override
	public VehicleType getType() {
		// TODO Auto-generated method stub
		return this.type;
	}

	@Override
	public VehicleSize getSize() {
		// TODO Auto-generated method stub
		return this.size;
	}

	@Override
	public boolean isSpaceOccupied() {
		// TODO Auto-generated method stub
		return this.isTaken;
	}

	@Override
	public void setIstaken(boolean isTaken) {
		// TODO Auto-generated method stub
		this.isTaken = isTaken;
	}
	
}
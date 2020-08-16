package vehicles;

public interface Space extends AvailableSpaces {

	boolean isSpaceOccupied(); 
	void setIstaken(boolean isTaken);
}

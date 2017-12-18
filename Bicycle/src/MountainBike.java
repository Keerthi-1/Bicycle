
public class MountainBike extends Bicycle{

	String suspension;

	public MountainBike(int speed, int cadence, int gear, String suspension) {
		super(speed, cadence, gear);
		this.suspension = suspension;
	}

	public String getSuspension() {
		return suspension;
	}

	public void setSuspension(String suspension) {
		this.suspension = suspension;
	}
	
	public void type() {
		System.out.println("The Mountain Bike is "+getSuspension()+ "Suspension");
	}
}

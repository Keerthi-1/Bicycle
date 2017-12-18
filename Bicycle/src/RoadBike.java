
public class RoadBike extends Bicycle {
	
	int tire;

	public RoadBike(int speed, int cadence, int gear, int tire) {
		super(speed, cadence, gear);
		this.tire = tire;
	}

	public int getTire() {
		return tire;
	}

	public void setTire(int tire) {
		this.tire = tire;
	}
	
	public void wheelSize() {
		System.out.println("Road Bike Wheel Size is: "+getTire()+"C");
	}
	
	

}

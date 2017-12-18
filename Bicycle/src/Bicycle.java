
public class Bicycle {
	
	int speed;
	int cadence;
	int gear;
	
	public Bicycle(int speed, int cadence, int gear) {
		this.speed = speed;
		this.cadence = cadence;
		this.gear = gear;
	}
	
	public void setCadence(int value) {
        cadence = value;
    }
        
    public void setGear(int value) {
        gear = value;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void accelerate(int increment) {
        speed += increment;
    }

}

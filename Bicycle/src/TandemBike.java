
public class TandemBike extends Bicycle {
	
	int seat;
	int handlebar;
	
	public TandemBike(int speed, int cadence, int gear, int seat, int handlebar) {
		super(speed, cadence, gear);
		this.seat = seat;
		this.handlebar = handlebar;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	public int getHandlebar() {
		return handlebar;
	}

	public void setHandlebar(int handlebar) {
		this.handlebar = handlebar;
	}
	
	public void model() {
		System.out.println("Tandem Bike has: "+getSeat()+" Seats");
		System.out.println("Tandem Bike has: "+getHandlebar()+" Handle bar");
	}
	

}


public class TestHierarchy {

	public static void main(String[] args) {
		
		MountainBike mbike = new MountainBike(15, 20, 3, "Full");
		RoadBike rbike = new RoadBike(15, 20, 1, 700);
		TandemBike tbike = new TandemBike(15, 20, 1, 2, 2);
		
		mbike.type();
		rbike.wheelSize();
		tbike.model();
		
	

	}

}

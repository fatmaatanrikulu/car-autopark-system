package donem;

public class RegularVehicle implements Vehicle {
	private String plate;
	

	public RegularVehicle(String plate) {
		super();
		this.plate = plate;
	}

	public RegularVehicle() {
		super();
	}

	@Override
	public String getPlate() {
		
		return plate;
	}

	@Override
	public Subscription getSubscription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isOfficial() {
		// TODO Auto-generated method stub
		return false;
	}

	
}

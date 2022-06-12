package donem;

public class OfficialVehicle implements Vehicle {
	private String plate;
	

	public OfficialVehicle(String plate) {
		super();
		this.plate = plate;
	}

	@Override
	public String getPlate() {
		// TODO Auto-generated method stub
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

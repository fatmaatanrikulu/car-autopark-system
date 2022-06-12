package donem;

public class SubscribedVehicle implements Vehicle{
	private String plate;
	private Date begin;
	private Date end;
	private Subscription subscription;
	
	public SubscribedVehicle(String plate, Date begin, Date end) {
		super();
		this.plate = plate;
		this.begin = begin;
		this.end = end;
	}
	@Override
	public String getPlate() {
		// TODO Auto-generated method stub
		return plate;
	}
	@Override
	public Subscription getSubscription() {
		// TODO Auto-generated method stub
		return subscription;
	}
	@Override
	public boolean isOfficial() {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean isValid() {
		Date date = new Date();
		if(date.isAfterThan(end))
			return true;
		else if(date.isEqualsWith(end))
			return true;
		else
			return false;
			
		}
	

	

}

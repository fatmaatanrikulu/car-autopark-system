package donem;

public class Subscription {
	private String plate;
	private Date begin,end;
	private SubscribedVehicle vehicle;
	
	
	public Subscription(String plate,Date begin, Date end, SubscribedVehicle vehicle) {
		super();
		this.plate = plate;
		this.begin = begin;
		this.end = end;
		this.vehicle = vehicle;
		
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

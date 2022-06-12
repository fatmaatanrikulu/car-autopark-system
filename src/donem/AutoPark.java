package donem;
import java.util.*;

public class AutoPark {
	private ArrayList<SubscribedVehicle> subscribedVehicles;
	private ArrayList<ParkRecord> parkRecords;
	private double hourlyFee,incomeDaily;
	private int capacity;
	
	public AutoPark() {
		super();
	}
	public AutoPark(double hourlyFee, double incomeDaily,int capacity) {
		super();
		this.hourlyFee = hourlyFee;
		this.incomeDaily = incomeDaily;
		this.capacity = capacity;
		subscribedVehicles = new ArrayList<SubscribedVehicle>();
		parkRecords = new ArrayList<ParkRecord>();
	}
	public SubscribedVehicle searchVehicle(String plate) {
		for(SubscribedVehicle m: subscribedVehicles) {
			if(m.getPlate().compareTo(plate)==0)
				return m;
		}return null;
	}
	public boolean isParked(String plate) {
		for(ParkRecord m:parkRecords) {
			if(m.getVehicle().getPlate( ).compareTo(plate)==0)
				return true;
		}
		return false;
	}
	public boolean addVehicle(SubscribedVehicle m) {
		if(searchVehicle(m.getPlate()) == null) {
			subscribedVehicles.add(m);
			System.out.println("M is added");
			return true;
		}
		else {
			//for(SubscribedVehicle vehicle:subscribedVehicles) {
			//	if(vehicle.getPlate().compareTo(m.getPlate())==0) {
					System.out.println("This plate exists");
				}
				return false;
			}
		
	
	public boolean vehicleEnters(String plate,Time enter, boolean isOfficial) {
		if(isParked(plate)==true) 
			return false;
		else if(parkRecords.size()<capacity) {
			SubscribedVehicle vehicle = searchVehicle(plate);
			if(vehicle != null) {
				ParkRecord park = new ParkRecord(enter,null,vehicle);
				parkRecords.add(park);
			}
			else if(isOfficial) {
				OfficialVehicle official = new OfficialVehicle(plate);
				ParkRecord park = new ParkRecord(enter,null,official);
				parkRecords.add(park);				
			}
			else{
				RegularVehicle regular = new RegularVehicle(plate);
				ParkRecord park = new ParkRecord(enter,null,regular);
				parkRecords.add(park);
				
			}
			
		}return true;
		
	}
	
	public boolean vehicleExits(String plate,Time exit) {
		for(ParkRecord park: parkRecords) {
			if(park.getVehicle().getPlate().compareTo(plate)==0) {
				park.setExitTime(exit);
				if(park.getVehicle().isOfficial()!= true) {
					System.out.println("Official Vehicle");
				}
				else if(park.getVehicle().getSubscription()!=null) {
					if(park.getVehicle().getSubscription().isValid()) {
						System.out.println("Have subscription");
					}
					else {
						System.out.println("Invalid subscription");
						int duration = park.getParkingDuration();
						if(duration <= 60) {
							System.out.println("Subscription Invalid, doesnt pay");
						}
						else 
							incomeDaily += (duration-60)*hourlyFee;
						System.out.println("Subscription Invalid Pays" + this.incomeDaily);
					}
					
				}
				else {
					System.out.println("Invalid subscription");
					int duration = park.getParkingDuration();
					if(duration <= 60) {
						System.out.println("Regular Car doesnt pay");
					}
					else {
						incomeDaily += (duration-60)*hourlyFee;
					System.out.println("Regular Car Pays" + this.incomeDaily);
					}
				}return true;
			}
			
			
			
		}return false;
		
		
		
	}
	public String yaz() {
		System.out.println("Park halindeki araclar");
		for(ParkRecord m :parkRecords) {
				if(m.getExitTime()==null) {
					System.out.println(m.getVehicle().getPlate());
				}
		}
		return null;
		
		
		
	}
	
	
	
	
	

}

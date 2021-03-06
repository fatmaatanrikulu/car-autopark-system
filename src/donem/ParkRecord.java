package donem;

public class ParkRecord {
	private Time enterTime,exitTime=null;
	private Vehicle vehicle;
	public ParkRecord(Time enterTime, Time exitTime, Vehicle vehicle) {
		super();
		this.enterTime = enterTime;
		this.exitTime = exitTime;
		this.vehicle = vehicle;
	}
	public Time getEnterTime() {
		return enterTime;
	}
	public void setEnterTime(Time enterTime) {
		this.enterTime = enterTime;
	}
	public Time getExitTime() {
		return exitTime;
	}
	public void setExitTime(Time exitTime) {
		this.exitTime = exitTime;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public int getParkingDuration() {
		return exitTime.getDifference(enterTime);
	}

}

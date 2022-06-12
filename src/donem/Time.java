
package donem;

public class Time {
	private int hour,minute;

	public Time(int hour, int minute) {
		super();
		this.hour = hour;
		this.minute = minute;
	}
	public int getDifference(Time other) {
		return (this.hour*60) + this.minute - (other.hour*60) - other.minute;
	}

}

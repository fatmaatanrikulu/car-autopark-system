package donem;
import java.time.LocalDate;
import java.util.*;
public class Date {
	private int day;
	private int month;
	private int year;
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}	
	public Date() {
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public boolean isAfterThan(Date other) {
		if(other.year < year )
			return true;
			if( year == other.year && month > other.month )
			return true;
			if( year == other.year && month == other.month && day > other.day )
			return true;
			return false;
	}
	public boolean isBeforeThan(Date other) {
		if( year < other.year )
			return true;
			if( year == other.year && month < other.month )
			return true;
			if( year == other.year && month == other.month && day < other.day )
			return true;
			return false;
	}
	public boolean isEqualsWith( Date other ) {
		if( day == other.day && month == other.month && year == other.year )
		return true;
		return false;
		}

	public Date getnow() {
		LocalDate localDate = LocalDate.now();
		Date now = new Date();
		now.month = localDate.getMonthValue();
		now.year = localDate.getYear();
		now.day = localDate.getDayOfMonth();
		return now;		
	}
}
	



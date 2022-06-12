package donem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class AutoParkTest {

	@Test
	void test() {
	//�n Haz�rl�k
		RegularVehicle rg= new RegularVehicle();
		
	//metodu cal�st�r
		boolean x = rg.isOfficial();
		
	//sonuc
		Assert.assertFalse(x);
	
		
	}
	@Test
	void test2() { //
	//�n Haz�rl�k
		AutoPark ao = new AutoPark(5,5,50);
		Date begin1 = new Date();
	     begin1.setDay(13);
	     begin1.setMonth(4);
	     begin1.setYear(2018);
	     
	     Date end1 = new Date();
	     end1.setDay(16);
	     end1.setMonth(5);
	     end1.setYear(2019);
	      
		SubscribedVehicle s1 = new SubscribedVehicle("sa1", begin1, end1);
		
	//metodu cal�st�r
		boolean x = ao.addVehicle(s1);
		
	//sonuc
		Assert.assertTrue(x);
	
		
	}
	
	

}


	

package donem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class JTest {

	@SuppressWarnings("deprecation")
	@Test
	void testSearchVehicle() {
		//ön Hazýrlýk
		AutoPark ao = new AutoPark(5,5,50);
		Date begin1 = new Date();
	     begin1.setDay(13);
	     begin1.setMonth(4);
	     begin1.setYear(2018);
	     
	     Date end1 = new Date();
	     end1.setDay(16);
	     end1.setMonth(5);
	     end1.setYear(2019);
	      
	     Date begin2 = new Date();
	     begin2.setDay(12);
	     begin2.setMonth(4);
	     begin2.setYear(2018);
	     
	     Date end2 = new Date();
	     end2.setDay(16);
	     end2.setMonth(5);
	     end2.setYear(2018);
	     
		SubscribedVehicle s1 = new SubscribedVehicle("sa1", begin1, end1);
		SubscribedVehicle s2 = new SubscribedVehicle("sa2", begin2, end2);
//metod calýstýr
		ao.addVehicle(s2);
		ao.addVehicle(s1);
		SubscribedVehicle x = ao.searchVehicle("sa1");
		//sonuc
		Assert.assertEquals(s1, x);
		
	}

	

	@SuppressWarnings("deprecation")
	@Test
	void testIsOfficial() {
	//ön Hazýrlýk
		RegularVehicle rg= new RegularVehicle();
		
	//metodu calýstýr
		boolean x = rg.isOfficial();
		
	//sonuc
		Assert.assertFalse(x);
	
		
	}
	@SuppressWarnings("deprecation")
	@Test
	void testAddVehicle() {
		//ön Hazýrlýk
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
				
			//metodu calýstýr
				boolean x = ao.addVehicle(s1);
				
			//sonuc
				Assert.assertTrue(x);
	}

	@SuppressWarnings("deprecation")
	@Test
	void testVehicleEnters() {
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

			Time enter = new Time(16, 5);

			
			
			boolean x =ao.vehicleEnters(s1.getPlate(), enter, false);
			
			Assert.assertTrue(x);
			
	
	}

	@SuppressWarnings("deprecation")
	@Test
	void testVehicleExits() {
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

		Time enter = new Time(16, 5);
		ao.vehicleEnters(s1.getPlate(), enter, false);
		
		Time exit = new Time(17, 10);

		//metod kullanýlýyor
		boolean x = ao.vehicleExits(s1.getPlate(), exit);
		//kontrol
		
		Assert.assertTrue(x);
	}

}

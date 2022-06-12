package donem;

public class Test {

	public static void main(String[] args) {
		
		AutoPark park = new AutoPark(5,5,50);
		
		RegularVehicle r1 = new RegularVehicle("ra1");
		RegularVehicle r2 = new RegularVehicle("ra2");
		RegularVehicle r3 = new RegularVehicle("ra3");
		
		OfficialVehicle o1 = new OfficialVehicle("of1");
		OfficialVehicle o2 = new OfficialVehicle("of2");
		
		
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
	     
	     Date begin3 = new Date();
	     begin3.setDay(13);
	     begin3.setMonth(4);
	     begin3.setYear(2018);
	     
	     Date end3 = new Date();
	     end3.setDay(15);
	     end3.setMonth(5);
	     end3.setYear(2019);
	     
	     Date begin4 = new Date();
	     begin4.setDay(13);
	     begin4.setMonth(4);
	     begin4.setYear(2018);
	     
	     Date end4 = new Date();
	     end4.setDay(15);
	     end4.setMonth(5);
	     end4.setYear(2019);
	      
		
		SubscribedVehicle s1 = new SubscribedVehicle("sa1", begin1, end1);
		SubscribedVehicle s2 = new SubscribedVehicle("34 os 34", begin2, end2);
		SubscribedVehicle s3 = new SubscribedVehicle("sa3", begin3, end3);
		SubscribedVehicle s4 = new SubscribedVehicle("sa4", begin4, end4);
		
		park.addVehicle(s1);
		park.addVehicle(s2);
		park.addVehicle(s3);
		
		Time enter = new Time(16, 5);
		Time exit = new Time(17, 10);
		
		park.vehicleEnters(s1.getPlate(), enter, false);
		park.vehicleEnters(s2.getPlate(), enter, false);
		park.vehicleEnters(s3.getPlate(), enter, false);
		park.vehicleEnters(s4.getPlate(), enter, false); 
		
		park.vehicleEnters(r1.getPlate(), enter, false);
		park.vehicleEnters(r2.getPlate(), enter, false);
		park.vehicleEnters(r3.getPlate(), enter, false);
		
		park.vehicleEnters(o1.getPlate(), enter, true);
		park.vehicleEnters(o2.getPlate(), enter, true);
		
		
		park.isParked("34 os 34");
		park.isParked(s2.getPlate());
		
		park.vehicleExits(s1.getPlate(), exit);
		park.vehicleExits(o1.getPlate(), exit);  
		park.vehicleExits(r1.getPlate(), exit);
		
		System.out.println(park.toString()); 
	
		
		
		
	}

}

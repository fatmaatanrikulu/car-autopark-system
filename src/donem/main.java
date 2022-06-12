package donem;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		AutoPark park = new AutoPark(5,5,50);
		RegularVehicle r1 = new RegularVehicle("34 AS 63");

		
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
	      
		
		SubscribedVehicle s1 = new SubscribedVehicle("34 AS 63", begin1, end1);
		SubscribedVehicle s2 = new SubscribedVehicle("34 os 34", begin2, end2);
		SubscribedVehicle s3 = new SubscribedVehicle("38 DS 653", begin3, end3);
		SubscribedVehicle s4 = new SubscribedVehicle("45 PL 963", begin4, end4);
		
		park.addVehicle(s1);
		park.addVehicle(s2);
		park.addVehicle(s3);
		
		Time enter = new Time(16, 5);
		Time exit = new Time(17, 10);
		
	//
		park.vehicleEnters(s1.getPlate(), enter, false);
		park.vehicleEnters(s2.getPlate(), enter, false);
		park.vehicleEnters(s3.getPlate(), enter, false);
		park.vehicleEnters(s4.getPlate(), enter, false); 
		int devam =1;
		while(devam==1) {
		System.out.println("**********OTOPARK SÝSTEMÝ***********");
		System.out.println("1 - Otoparka arac ekle ");
		System.out.println("2 - Otoparktan arac cýkar");
		System.out.println("3 - Otoparktaki araclarý sýrala");
		int i = in.nextInt();
		
		switch(i) {
		case 1 : 
			
			System.out.println("Ekleyeceginiz arac türü nedir ");
			System.out.println("1 - Official");
			System.out.println("2 - Regular");
			System.out.println("3 - Subscribed");
//			Time enter = new Time(16, 5); 
			int type = in.nextInt();
			System.out.println("Ekleyeceginiz aracýn plakasýný giriniz");
			String plate = in.next();
			if(type == 1) {
				park.vehicleEnters(plate, enter, true);
			}
			else {
				park.vehicleEnters(plate, enter, false);
			}
			break;
		case 2:
//			Time exit = new Time(17, 10);
			System.out.println("Cýkarmak istediginiz aracýn plakasýný giriniz");
			String plate1 = in.next();
			park.vehicleExits(plate1, exit);
			
			break;
		case 3:
				System.out.println(park.yaz());
			break;
		}
		
		
		}
	}

}

package parkthecar;

import models.*;
import java.util.Date;
import services.ChargesServiceImpl;
import services.ChargesService;
import services.ParkingService;
import services.ParkVehicleServiceImpl;
import models.Time;

public class Main {
           
	
	public static void main(String[] args){
		
		Vehicle vehicle = new Cycle("DL34434");
		
		 Date indate = new Date(); 
		// Is used to set time by milliseconds. Adds 15680  
        // milliseconds to January 1, 1970 to get new time. 
        indate.setTime(15680); 
        models.Time.setInTime(15680);
        
		ParkingLot.makeParkingLot();
		ParkingService park = new ParkVehicleServiceImpl();
		park.parkVehicleService(vehicle);
		Long duration =  park.removeVehicleAndGetDuration("DL34434");
		ChargesService charges = new ChargesServiceImpl();
		
		try {	 
			System.out.println(charges.calculateCharges(vehicle.getVehicleType(), Duration));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
}

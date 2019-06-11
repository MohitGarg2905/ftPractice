package models;

import java.util.*;
import constant.VehicleType;
import models.ParkingLot;


public class Floor {
	
	        
	
	public static void floorNumber(Vehicle vehicle){
		ArrayList<Integer> floorsAvailable =   new ArrayList<Integer>();
		    VehicleType.VehicleTypes v = vehicle.getVehicleType();
		    floorsAvailable = ParkingLot.VehicleTypeWiseFloor.get(v);   
		   // vehicle.setFloor(floor);
		    
	}

}

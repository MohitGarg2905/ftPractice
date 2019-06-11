package parking;

import vehicles.Vehicle;
import java.util.*;

public class slot {
      
	private static ArrayList<Integer[]> occupied =   new ArrayList<Integer[]>();
	
	public static Integer[] slotId(Vehicle vehicle) {	
   	 
   	 Integer slotKey = 0;
	 	
   	//Id generator
   	 Integer[] slotId = new Integer[3];
   	 slotId[0] = vehicle.getWheels();
   	 slotId[1] = vehicle.getFloor();
   	 slotId[2] = slotKey;
   	 
 	 //try to give slot
   	ArrayList<Integer> slotIdList = new ArrayList<Integer>();
	 slotIdList.add(vehicle.getWheels());
	 slotIdList.add(vehicle.getFloor());
	 slotIdList.add(slotKey);
   	 boolean checkSlotOccupied = occupied.contains(slotIdList); 
        if (checkSlotOccupied)
        {
       	 System.out.println("slotoccupied");
        }
        else
        {   	 if(slotKey <10)
        			{  System.out.println(slotId);
        				occupied.add(slotId);
        				slotKey++;}
        		else
        		{
        			System.out.println("ParkingFull");
        		}
        }   
        
        return slotId;
    }	
	
	
	
}

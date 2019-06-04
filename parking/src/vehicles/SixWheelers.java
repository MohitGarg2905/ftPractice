package vehicles;

import java.util.HashMap;
import java.util.Map;

import vehicles.Vehicle;

public class SixWheelers extends Vehicle{
       
	   Integer floor;
	   
	   void floorNumber(Integer floor)
	   			{         this.floor = floor;
		   				Map<Integer,Integer> getFloorOfSixWheelers = new HashMap<Integer,Integer>();
		   				getFloorOfSixWheelers.put(floor,6);

	   				}
      
}

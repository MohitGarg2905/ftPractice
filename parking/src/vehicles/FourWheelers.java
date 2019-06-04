package vehicles;

import java.util.HashMap;
import java.util.Map;

import vehicles.Vehicle;

public class FourWheelers extends Vehicle{
       
	   Integer floor;
	   
	   void floorNumber(Integer floor)
	   			{         this.floor = floor;
		   				Map<Integer,Integer> getFloorOfFourWheelers = new HashMap<Integer,Integer>();
		   				getFloorOfFourWheelers.put(floor,4);
		   				getFloorOfFourWheelers.put(floor,5);
	   				}
      
}

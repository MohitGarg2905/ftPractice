package vehicles;

import java.util.HashMap;
import java.util.Map;

import vehicles.Vehicle;

public class TwoWheelers extends Vehicle{
       
	   Integer floor;
	   
	   void floorNumber(Integer floor)
	   			{         this.floor = floor;
		   				Map<Integer,Integer> getFloorOfTwoWheelers = new HashMap<Integer,Integer>();
		   				getFloorOfTwoWheelers.put(floor,1);
		   				getFloorOfTwoWheelers.put(floor,2);
		   				getFloorOfTwoWheelers.put(floor,3);
	   				}
      
}

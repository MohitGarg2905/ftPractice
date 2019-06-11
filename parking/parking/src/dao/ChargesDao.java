package dao;

import java.util.HashMap;
import java.util.Map;
import constant.VehicleType;

import static constant.VehicleType.VehicleTypes;

public class ChargesDao {
    
	private static Map<VehicleType.VehicleTypes, Integer> perHourChargesByVehicleTypes = new HashMap();
	  
	  static 
	        {
		  		perHourChargesByVehicleTypes.put(VehicleType.VehicleTypes.twoWheeler, 20);
		  		perHourChargesByVehicleTypes.put(VehicleType.VehicleTypes.fourWheeler, 20);
		  		perHourChargesByVehicleTypes.put(VehicleType.VehicleTypes.sixWheeler, 20);	
	        }
	public Integer getChargesByVehilcTypes(VehicleType.VehicleTypes vehicleTypes) throws Exception{
		Integer charges = perHourChargesByVehicleTypes.get(vehicleTypes);
		
		if(charges == null){
			throw new Exception("Invaild vehicle type");
		}
		else
		{
		    return charges;	
		}
	} 
	
}

package mohit.examples.assignment.parkingLot.dao;

import mohit.examples.assignment.parkingLot.constants.VehicleConstants;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mohit 31-May-2019
 */
public class ChargesDao {

    private static Map<VehicleConstants.VEHICLE_TYPES, Integer> perHourVehicleCharges = new HashMap();

    static{
        perHourVehicleCharges.put(VehicleConstants.VEHICLE_TYPES.twoWheeler, 10);
        perHourVehicleCharges.put(VehicleConstants.VEHICLE_TYPES.threeWheeler, 20);
        perHourVehicleCharges.put(VehicleConstants.VEHICLE_TYPES.fourWheeler, 40);
        perHourVehicleCharges.put(VehicleConstants.VEHICLE_TYPES.sixWheeler, 60);
    }

    public Integer getPerHourChargesByVehicleType(VehicleConstants.VEHICLE_TYPES vehicleType) throws Exception {
        Integer charges = perHourVehicleCharges.get(vehicleType);
        if(charges==null)
            throw new Exception("Invalid vehicle type");
        return charges;
    }
}

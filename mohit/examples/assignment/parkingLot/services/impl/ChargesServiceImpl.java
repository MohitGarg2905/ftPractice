package mohit.examples.assignment.parkingLot.services.impl;

import mohit.examples.assignment.parkingLot.constants.VehicleConstants;
import mohit.examples.assignment.parkingLot.dao.ChargesDao;
import mohit.examples.assignment.parkingLot.services.ChargesService;

/**
 * @author mohit 31-May-2019
 */
public class ChargesServiceImpl implements ChargesService {

    private ChargesDao chargesDao = new ChargesDao();


    public Integer calculateCharges(VehicleConstants.VEHICLE_TYPES vehicleType, long duration) throws Exception{
        Integer perHourCharges = chargesDao.getPerHourChargesByVehicleType(vehicleType);
        //Using Math.Floor so that we can get the higher value of time. Even if vehicle was parked for 20 mins, charges are applicable for full hour.
        int timeInHours = new Double(Math.floor(duration/3600)).intValue();
        return timeInHours*perHourCharges;
    }
}
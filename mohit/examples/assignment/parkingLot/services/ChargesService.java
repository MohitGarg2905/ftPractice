package mohit.examples.assignment.parkingLot.services;

import mohit.examples.assignment.parkingLot.constants.VehicleConstants;

/**
 * @author mohit 31-May-2019
 *
 */
public interface ChargesService {

    /**
     * Calculates the charges for the parking duration
     *
     * @param vehicleType
     * @param duration in seconds
     * @return
     * @throws Exception
     */
    Integer calculateCharges(VehicleConstants.VEHICLE_TYPES vehicleType, long duration) throws Exception;
}

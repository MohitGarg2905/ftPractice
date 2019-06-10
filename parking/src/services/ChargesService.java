package services;

import constant.VehicleType;

public interface ChargesService {
                   
	/**
     * Calculates the charges for the parking duration
     *
     * @param vehicleType
     * @param duration in seconds
     * @return
     * @throws Exception
     */
    Integer calculateCharges(VehicleType.VehicleTypes vehicleType, long duration) throws Exception;
}

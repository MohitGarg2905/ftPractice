package models;

import java.util.HashMap;
import models.Vehicle;
import java.util.Map;

import constant.VehicleType;
import models.Vehicle;

abstract class TwoWheelers extends Vehicle{
       
	   public TwoWheelers(String regnumber) {
		super(regnumber);
		setWheels(2);
		setVehicleType(VehicleType.VehicleTypes.twoWheeler);
		// TODO Auto-generated constructor stub
	}
 
}

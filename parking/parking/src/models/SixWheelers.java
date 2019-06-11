package models;

import java.util.HashMap;
import java.util.Map;

import constant.VehicleType;
import models.Vehicle;

abstract class SixWheelers extends Vehicle{
       
	   public SixWheelers(String regnumber) {
		super(regnumber);
		setWheels(6);
		setVehicleType(VehicleType.VehicleTypes.sixWheeler);
		// TODO Auto-generated constructor stub
	}

      
}

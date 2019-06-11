package models;

import java.util.HashMap;
import java.util.Map;

import constant.VehicleType;
import models.Vehicle;

abstract class FourWheelers extends Vehicle{
       
	   public FourWheelers(String regnumber) {
		super(regnumber);
		setWheels(4);
		setVehicleType(VehicleType.VehicleTypes.fourWheeler);
		// TODO Auto-generated constructor stub
	}

}

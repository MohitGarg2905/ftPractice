package models;

import constant.VehicleType;
abstract public class Vehicle {
         private final String regnumber;
         private VehicleType.VehicleTypes vehicleType;
         public Integer Wheels;
         
      
		public Integer getWheels() {
			return Wheels;
		}
		public void setWheels(Integer wheels) {
			Wheels = wheels;
		}
		public Vehicle(String regnumber){
        	 this.regnumber = regnumber;
         }  
		public VehicleType.VehicleTypes getVehicleType() {
			return vehicleType;
		}

		public String getRegnumber() {
			return regnumber;
		}
		public void setVehicleType(VehicleType.VehicleTypes vehicleType) {
			this.vehicleType = vehicleType;
		}   
		
}




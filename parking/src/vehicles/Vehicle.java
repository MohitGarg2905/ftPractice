package vehicles;

import constant.VehicleType;
abstract public class Vehicle {
         private final String regnumber;
         private VehicleType.VehicleTypes vehicleType;
         public Integer floor;
         public Integer slotId;
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

		public void setVehicleType(VehicleType.VehicleTypes vehicleType) {
			this.vehicleType = vehicleType;
		}

		public String getRegnumber() {
			return regnumber;
		}
		
		public Integer getFloor() {
			return floor;
		}
		public void setFloor(Integer floor) {
			this.floor = floor;
		}
		public Integer getSlotId() {
			return slotId;
		}
		public void setSlotId(Integer slotId) {
			this.slotId = slotId;
		}
                 
}




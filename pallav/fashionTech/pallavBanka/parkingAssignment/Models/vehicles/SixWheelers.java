package fashionTech.pallavBanka.parkingAssignment.Models.vehicles;

import fashionTech.pallavBanka.parkingAssignment.Constants.VehicleConstant;
import fashionTech.pallavBanka.parkingAssignment.Models.Vehicle;

abstract public class SixWheelers extends Vehicle {
    public SixWheelers(Integer regNo){
        super(regNo);
    }
    @Override
    protected void setVehicleType(){
        this.vehicleType = VehicleConstant.VehicleType.sixwheeler;
    }
}

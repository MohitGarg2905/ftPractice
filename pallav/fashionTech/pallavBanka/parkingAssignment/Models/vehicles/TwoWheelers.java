package fashionTech.pallavBanka.parkingAssignment.Models.vehicles;

import fashionTech.pallavBanka.parkingAssignment.Constants.VehicleConstant;
import fashionTech.pallavBanka.parkingAssignment.Models.Vehicle;

abstract public class TwoWheelers extends Vehicle {
    public TwoWheelers(Integer regNo){
        super(regNo);
    }
    @Override
    protected void setVehicleType(){
        this.vehicleType = VehicleConstant.VehicleType.twowheeler;
    }
}

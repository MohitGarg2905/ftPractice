package fashionTech.pallavBanka.parkingAssignment.Models.vehicles;

import fashionTech.pallavBanka.parkingAssignment.Constants.VehicleConstant;
import fashionTech.pallavBanka.parkingAssignment.Models.Vehicle;

abstract public class FourWheelers extends Vehicle {
    public FourWheelers(Integer regNo){
        super(regNo);
    }
    @Override
    protected void setVehicleType(){
        this.vehicleType = VehicleConstant.VehicleType.fourwheeler;
    }
}

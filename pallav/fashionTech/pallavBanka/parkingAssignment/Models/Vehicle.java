package fashionTech.pallavBanka.parkingAssignment.Models;

import fashionTech.pallavBanka.parkingAssignment.Constants.VehicleConstant;

abstract public class Vehicle {
    private Integer regNo;
    protected VehicleConstant.VehicleType vehicleType;

    public Vehicle(Integer regNo){
        this.regNo=regNo;
    }

    public Integer getRegNo() {
        return regNo;
    }

    public VehicleConstant.VehicleType getVehicleType() {
        return vehicleType;
    }

    abstract protected void setVehicleType();

    abstract public void drive();
}



package fashionTech.assignment.models;

import fashionTech.assignment.Constants.VehicleTypeList;

abstract class FourWheeler extends Vehicle{
    public FourWheeler(String regNo) {
        super();
        this.type = VehicleTypeList.vehicleTypes.fourWheeler;
        this.regNo=regNo;
    }
    abstract void drive();
}
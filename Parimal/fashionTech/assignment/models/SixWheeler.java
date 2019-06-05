package fashionTech.assignment.models;

import fashionTech.assignment.Constants.VehicleTypeList;

abstract class SixWheeler extends Vehicle{
    public SixWheeler(String regNo) {
        super();
        this.type = VehicleTypeList.vehicleTypes.fourWheeler;
        this.regNo=regNo;
    }
    abstract void drive();
}

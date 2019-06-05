package fashionTech.assignment.models;

import fashionTech.assignment.Constants.VehicleTypeList;

abstract class TwoWheeler extends Vehicle{
    public TwoWheeler(String regNo) {
        super();
        this.type = VehicleTypeList.vehicleTypes.fourWheeler;
        this.regNo=regNo;
    }
    abstract void drive();
}

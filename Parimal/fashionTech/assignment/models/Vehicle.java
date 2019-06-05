package fashionTech.assignment.models;
import fashionTech.assignment.Constants.VehicleTypeList;

abstract public class Vehicle {
    protected String regNo;
    protected VehicleTypeList.vehicleTypes type;
    Vehicle(){}
    public Vehicle(String regNo,VehicleTypeList.vehicleTypes type){
        this.regNo=regNo;
        this.type=type;
    }
    public String getRegNo() {
        return regNo;
    }

    public VehicleTypeList.vehicleTypes getType() {
        return type;
    }

    abstract void drive();
}




    //String regNo, VehicleTypeList.vehicleTypes type
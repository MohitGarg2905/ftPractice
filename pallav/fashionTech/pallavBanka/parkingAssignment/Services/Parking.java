package fashionTech.pallavBanka.parkingAssignment.Services;

import fashionTech.pallavBanka.parkingAssignment.Models.Floor;
import fashionTech.pallavBanka.parkingAssignment.Models.ParkingTime;
import fashionTech.pallavBanka.parkingAssignment.Models.Slot;
import fashionTech.pallavBanka.parkingAssignment.Models.Vehicle;

import java.util.Date;
import java.util.List;

class Parking{
    private Integer slotId;
    private Integer regNo;
    private List floor;
    private Date inTime;
    private Date outTime;
    ParkingTime parkingTime = new ParkingTime(inTime);
    ParkingCharge parkingCharge=new ParkingCharge();
    public Parking(Integer regNo){
        this.regNo=regNo;
    }
    void parkVehicle(Vehicle vehicle){
        Slot.setOccupied(slotId);
        floor= Floor.getVehicleTypeWiseFloor(vehicle.getVehicleType());
    }
    void getVehicle(Vehicle vehicle){
        vehicle.getVehicleType();
        ParkingTime.setOutTime(outTime);
        parkingCharge.getParkingCharges(vehicle.getVehicleType(), ParkingTime.getInTime(), ParkingTime.getOutTime());
        Slot.getSlotId();
        Floor flooralloted=new Floor();
        flooralloted.getVehicleTypeWiseFloor(vehicle.getVehicleType());
        Slot.setUnoccupied(slotId);
    }
}

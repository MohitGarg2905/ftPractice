package fashionTech.assignment.dao;
import fashionTech.assignment.Constants.VehicleTypeList;
import fashionTech.assignment.Constants.OtherConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Iterator;
//import java.util.LinkedList;
public class SlotAndFloor {
    //static LinkedList<String> occupied=new LinkedList();
    private static  Map<VehicleTypeList.vehicleTypes, List> floorCorrespondingVehicle = new HashMap();
    private static Map<Integer, List> slotFloorConn = new HashMap();
    private static Map<Integer, String> slotAvailability = new HashMap();
    private static  SlotAndFloor singleInstance= null;
    private SlotAndFloor() {
       // Map<VehicleTypeList.vehicleTypes, List> floorCorrespondingVehicle = new HashMap();
        ArrayList<Integer> twoWheelers = new ArrayList<Integer>();
        ArrayList<Integer> fourWheelers = new ArrayList<Integer>();
        ArrayList<Integer> sixWheelers = new ArrayList<Integer>();
        sixWheelers.add(0);
        twoWheelers.add(1);
        fourWheelers.add(2);
        floorCorrespondingVehicle.put(VehicleTypeList.vehicleTypes.twoWheeler,twoWheelers);
        floorCorrespondingVehicle.put(VehicleTypeList.vehicleTypes.fourWheeler,fourWheelers);
        floorCorrespondingVehicle.put(VehicleTypeList.vehicleTypes.sixWheeler,fourWheelers);
        ArrayList<Integer> GroundFloorSlotList = new ArrayList<Integer>();
        ArrayList<Integer> FirstFloorSlotList = new ArrayList<Integer>();
        ArrayList<Integer> SecondFloorSlotList = new ArrayList<Integer>();
        GroundFloorSlotList.add(01);
        GroundFloorSlotList.add(02);
        FirstFloorSlotList.add(11);
        FirstFloorSlotList.add(12);
        SecondFloorSlotList.add(21);
        SecondFloorSlotList.add(22);
        slotFloorConn.put(1,GroundFloorSlotList);
        slotFloorConn.put(2,FirstFloorSlotList);
        slotFloorConn.put(3,SecondFloorSlotList);
        slotAvailability.put(01,OtherConstants.UNOCCUPIED);
        slotAvailability.put(02,OtherConstants.UNOCCUPIED);
        slotAvailability.put(11,OtherConstants.UNOCCUPIED);
        slotAvailability.put(12,OtherConstants.UNOCCUPIED);
        slotAvailability.put(21,OtherConstants.UNOCCUPIED);
        slotAvailability.put(22,OtherConstants.UNOCCUPIED);

    }
    public static SlotAndFloor getInstance(){
        if(singleInstance==null){
            singleInstance= new SlotAndFloor();
        }
        return singleInstance;
    }
    public List getFloor(VehicleTypeList.vehicleTypes type){
        return floorCorrespondingVehicle.get(type);
    }
    public List getSlotList(List floorList){
        return slotFloorConn.get(floorList);
    }
    public void getSlot(List slotList){
        if (slotAvailability.containsValue(OtherConstants.UNOCCUPIED)){
            Iterator iterator = slotList.iterator();
            while (iterator.hasNext()) {
                if (slotAvailability.get(iterator).equals(OtherConstants.UNOCCUPIED)){
                    slotAvailability.replace(iterator.next(),OtherConstants.UNOCCUPIED)

                }
            }
        }
    }
}


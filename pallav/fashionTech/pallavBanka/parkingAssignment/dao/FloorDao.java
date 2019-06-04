package fashionTech.pallavBanka.parkingAssignment.dao;

import fashionTech.pallavBanka.parkingAssignment.Constants.VehicleConstant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FloorDao {

    protected static Map<VehicleConstant.VehicleType, List> vehicleTypeWiseFloor = new HashMap();
    private static ArrayList<Integer> twoVehicleFloors = new ArrayList();
    private static ArrayList<Integer> fourVehicleFloors = new ArrayList();
    private static ArrayList<Integer> sixVehicleFloors = new ArrayList();
    static {
        sixVehicleFloors.add(0);
        twoVehicleFloors.add(1);
        twoVehicleFloors.add(2);
        fourVehicleFloors.add(3);
        fourVehicleFloors.add(4);
        twoVehicleFloors.add(5);
        vehicleTypeWiseFloor.put(VehicleConstant.VehicleType.twowheeler, twoVehicleFloors);
        vehicleTypeWiseFloor.put(VehicleConstant.VehicleType.fourwheeler, fourVehicleFloors);
        vehicleTypeWiseFloor.put(VehicleConstant.VehicleType.sixwheeler, sixVehicleFloors);
    }
}

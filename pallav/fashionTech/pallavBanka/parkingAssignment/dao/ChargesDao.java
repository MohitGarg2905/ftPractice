package fashionTech.pallavBanka.parkingAssignment.dao;

import fashionTech.pallavBanka.parkingAssignment.Constants.VehicleConstant;

import java.util.HashMap;
import java.util.Map;

public class ChargesDao {
    private static Map<VehicleConstant.VehicleType, Integer> charges = new HashMap();
    static{
        charges.put(VehicleConstant.VehicleType.twowheeler, 20);
        charges.put(VehicleConstant.VehicleType.fourwheeler, 40);
        charges.put(VehicleConstant.VehicleType.sixwheeler, 80);
    }
    public static Integer getcharges(VehicleConstant.VehicleType vehicleType){
        return charges.get(vehicleType);
    }
}

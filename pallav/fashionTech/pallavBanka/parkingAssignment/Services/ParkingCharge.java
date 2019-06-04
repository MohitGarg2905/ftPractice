package fashionTech.pallavBanka.parkingAssignment;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ParkingCharge {
    private Long ParkingCharges(VehicleConstant.VehicleType vehicleType, Date inTime, Date outTime) {
        Map<VehicleConstant.VehicleType, Integer> charges = new HashMap();
        charges.put(VehicleConstant.VehicleType.twowheeler, 20);
        charges.put(VehicleConstant.VehicleType.fourwheeler, 40);
        charges.put(VehicleConstant.VehicleType.sixwheeler, 80);
        if (outTime != null){
            //difference in time in milliseconds
            Long diff = outTime.getTime() - inTime.getTime();
            Long diffHours = diff / (3600000) % 24;
            return charges.get(vehicleType)*diffHours;
        } else{
            System.out.println("The vehicle hasn't left the premises.");
            return null;
        }
    }
}

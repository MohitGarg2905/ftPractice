package fashionTech.pallavBanka.parkingAssignment.Services;

import fashionTech.pallavBanka.parkingAssignment.Constants.VehicleConstant;
import fashionTech.pallavBanka.parkingAssignment.dao.ChargesDao;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ParkingCharge {
    public static Long getParkingCharges(VehicleConstant.VehicleType vehicleType, Date inTime, Date outTime) {

        if (outTime != null){
            //difference in time in milliseconds
            Long diff = outTime.getTime() - inTime.getTime();
            Long diffHours = diff / (3600000);
            return ChargesDao.getcharges(vehicleType)*diffHours;
        } else{
            System.out.println("The vehicle hasn't left the premises.");
            return null;
        }
    }
}

package fashionTech.pallavBanka.parkingAssignment.Models;

import fashionTech.pallavBanka.parkingAssignment.Constants.VehicleConstant;
import fashionTech.pallavBanka.parkingAssignment.dao.FloorDao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Floor extends FloorDao {
    public static List getVehicleTypeWiseFloor(VehicleConstant.VehicleType vehicleType) {
        return FloorDao.vehicleTypeWiseFloor.get(vehicleType);
    }
}

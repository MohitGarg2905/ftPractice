package fashionTech.pallavBanka.parkingAssignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Floor {
    private void floor() {
        Map<VehicleConstant.VehicleType, List> vehiclewisefloor = new HashMap();
        ArrayList<Integer> twovehiclefloors=new ArrayList();
        ArrayList<Integer> fourvehiclefloors=new ArrayList();
        ArrayList<Integer> sixvehiclefloors=new ArrayList();
        sixvehiclefloors.add(0);
        twovehiclefloors.add(1);
        twovehiclefloors.add(2);
        fourvehiclefloors.add(3);
        fourvehiclefloors.add(4);
        twovehiclefloors.add(5);
        vehiclewisefloor.put(VehicleConstant.VehicleType.twowheeler,twovehiclefloors);
        vehiclewisefloor.put(VehicleConstant.VehicleType.fourwheeler,fourvehiclefloors);
        vehiclewisefloor.put(VehicleConstant.VehicleType.sixwheeler,sixvehiclefloors);
    }
}

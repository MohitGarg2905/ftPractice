package fashionTech.assignment.dao;
import fashionTech.assignment.Constants.VehicleTypeList;

import java.util.List;
public class SlotDriverClass{
    private static SlotAndFloor slotDao= SlotAndFloor.getInstance();
    public void getSlot(VehicleTypeList.vehicleTypes type){
        List<Integer> floorList= slotDao.getFloor(type);
        List<Integer> slotList= slotDao.getSlotList(floorList);

    }
}

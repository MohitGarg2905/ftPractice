package fashionTech.pallavBanka.parkingAssignment.Models;

import java.util.LinkedList;
import fashionTech.pallavBanka.parkingAssignment.dao.SlotDao;

public class Slot extends SlotDao {
    Integer slotId;

    public Slot(Integer slotId) {
        this.slotId = slotId;
    }

    public Integer getSlotId() {
        if (SlotDao.checkAvailability(slotId)) {
            return slotId;
        } else
            return null;
    }
    public void setOccupied(){
        if(SlotDao.checkAvailability(slotId)){
            SlotDao.occupied.add(slotId-1,"occupied");
        }
    }
    public void setUnoccupied(Integer slotId){
        SlotDao.occupied.add(slotId-1,null);
    }
}


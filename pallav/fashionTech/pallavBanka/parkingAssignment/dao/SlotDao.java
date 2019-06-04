package fashionTech.pallavBanka.parkingAssignment.dao;

import java.util.LinkedList;

public class SlotDao {
    protected static LinkedList<String> occupied=new LinkedList();

    public static boolean checkAvailability(Integer i) {
        if (SlotDao.occupied.get(i)==null) {
            System.out.println("Slot is available");
            return true;
        } else if (SlotDao.occupied.get(i)=="occupied") {
            System.out.println("Slot is unavailable");
            return false;
        } else {
            System.out.println("Enter a valid slot id");
            return false;
        }
    }
}

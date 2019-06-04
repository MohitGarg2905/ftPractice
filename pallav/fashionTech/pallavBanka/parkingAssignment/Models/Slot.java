package fashionTech.pallavBanka.parkingAssignment;

import java.util.LinkedList;

public class Slot{
    LinkedList<String> occupied=new LinkedList();
    boolean occupySlot(Integer i) {
        if (occupied.get(i)==null) {
            occupied.add(i,"occupied");
            System.out.println("You have been allotted slot id:" + i);
            return true;
        } else if (occupied.get(i)=="occupied") {
            System.out.println("This slot is unavailable");
            return false;
        } else {
            System.out.println("Enter a valid slot id");
            return false;
        }
    }
}


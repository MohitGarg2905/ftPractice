package fashionTech.pallavBanka.parkingAssignment;

import java.util.*;

class Parking{
    Integer slotid;
    void parkVehicle(Vehicle v, Slot s){
        Integer regno=v.regno;
        Short floor;
        if(s.occupySlot(slotid-1)){
            System.out.println("Your slot is:" + slotid + "Your floor is:" + floor + "");
        }
    }
    void getVehicle(Vehicle v,int regno){

    }
}

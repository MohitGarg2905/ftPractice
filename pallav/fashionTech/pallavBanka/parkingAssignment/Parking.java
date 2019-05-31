package fashionTech.pallavBanka.parkingAssignment;

import java.util.*;

class ParkingCharge {
    Date inTime;
    Date outTime;
    private Long ParkingTime(Date inTime, Date outTime) {
        this.inTime = inTime;
        this.outTime = outTime;
        if (this.outTime != null) {
            //difference in time in milliseconds
            Long diff = outTime.getTime() - inTime.getTime();
            Long diffHours = diff / (60 * 60 * 1000) % 24;
            return diffHours;
        } else{
            System.out.println("The vehicle hasn't left the premises.");
            return null;
        }
    }
    private Long charges(String s){
        Hashtable<String, Integer> charges=new Hashtable<String, Integer>();
        charges.put("TwoWheeler", 20);
        charges.put("FourWheeler", 40);
        charges.put("SixWheeler", 80);
        return charges.get(s)*ParkingTime(inTime, outTime);
    }
}

class Floor {
    private void floor() {
        Hashtable<Integer, String> vehiclewisefloor = new Hashtable<Integer, String>();
        vehiclewisefloor.put(0,"SixWheeler");
        vehiclewisefloor.put(1, "TwoWheelers");
        vehiclewisefloor.put(2, "TwoWheelers");
        vehiclewisefloor.put(3,"FourWheeler");
        vehiclewisefloor.put(4,"FourWheeler");
        vehiclewisefloor.put(5, "TwoWheelers");
    }
}

class Slot{
    ArrayList<Integer> unoccupied=new ArrayList<Integer>();
    ArrayList<Integer> occupied=new ArrayList<Integer>();
    void checkSlotId(Integer i){
        if(unoccupied.contains(i)){
            unoccupied.remove(i);
            occupied.add(i);
            System.out.println("You have been allotted slot id:" + i);
        }else if(occupied.contains(i)){
            System.out.println("This slot is unavailable");
        }else
            System.out.println("Enter a valid slot id");
    }
}

class Parking{
    void parkVehicle(Vehicle v, Slot s){
        Integer regno=v.regno;
        Integer slotid;
        Short floor;
        s.checkSlotId(slotid);
    }
    void getVehicle(Vehicle v,int regno){
        Map<Integer,ParkingCharge> Charges=new HashMap<Integer,ParkingCharge>();
    }
}

class Vehicle{
    Integer regno;
    void drive(){
    }
}

class TwoWheelers extends Vehicle{
    void drive(){
    }
}
class Scooties extends TwoWheelers{
    Integer regno;
    void drive(){
    }
}
class Cycle extends TwoWheelers{
    Integer regno;
    void drive(){
    }
}
class SportsBike extends TwoWheelers{
    Integer regno;
    void drive(){
    }
}
class CruiserBike extends TwoWheelers{
    Integer regno;
    void drive(){
    }
}
class FourWheelers extends Vehicle{
    void drive(){
    }
}
class HatchBack extends FourWheelers{
    Integer regno;
    void drive(){
    }
}
class Sedan extends FourWheelers{
    Integer regno;
    void drive(){
    }
}
class SUV extends FourWheelers{
    Integer regno;
    void drive(){
    }
}
class SixWheelers extends Vehicle{
    Integer regno;
    void drive(){
    }
}
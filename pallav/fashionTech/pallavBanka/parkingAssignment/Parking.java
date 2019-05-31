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

class Slot{
    ArrayList<Integer> unoccupied=new ArrayList<Integer>();
    ArrayList<Integer> occupied=new ArrayList<Integer>();
    void slotId(Integer i){
        if(unoccupied.contains(i)){
            unoccupied.remove(i);
            occupied.add(i);
        }else if(occupied.contains(i)){
            System.out.println("This slot is unavailable");
        }else
            System.out.println("Enter a valid slot id");
    }
}

class Parking{
    void parkVehicle(Vehicle v, Slot s){
        Integer regno=v.regno;
        Short floor;
        Integer slotid;
        floor=v.floor;
        slotid=v.slotid;
        Map<Integer,ParkingCharge> map=new HashMap<Integer,ParkingCharge>();
    }
    void getVehicle(Vehicle v,int regno){
        if(v.regno==regno) {

        }
    }
}

class Vehicle{
    Integer regno;
    Short floor;
    Integer slotid;
    void drive(){

    }
}

class TwoWheelers extends Vehicle{
    Short floor;
    /*int slotid[];
    void slotid(){
        for(int i=0;i<30;i++){
            this.slotid[i]=i+1;
        }
    }*/
    void floor(short floor) {
        this.floor=floor;
        if (floor == 1 || floor == 2 || floor==5){
            System.out.println("You are on floor:" + floor + "This floor is for two wheeler.");
        } else
            System.out.println("You are on the wrong floor.");
    }
    void drive(){

    }
}
class Scooties extends TwoWheelers{
    Integer regno;
    Integer slotid;
    void drive(){
        if(slotid>30) {
            System.out.println("This floor is full");
        }else
            System.out.println("Your floor is:" + floor + "Your Slot Id is:" + slotid);
    }
}
class Cycle extends TwoWheelers{
    Integer regno;
    Integer slotid;
    void drive(){
        if(slotid>30) {
            System.out.println("This floor is full");
        }else
            System.out.println("Your floor is:" + floor + "Your Slot Id is:" + slotid);
    }
}
class SportsBike extends TwoWheelers{
    Integer regno;
    Integer slotid;
    void drive(){
        if(slotid>30) {
            System.out.println("This floor is full");
        }else
            System.out.println("Your floor is:" + floor + "Your Slot Id is:" + slotid);
    }
}
class CruiserBike extends TwoWheelers{
    Integer regno;
    Integer slotid;
    void drive(){
        if(slotid>30) {
            System.out.println("This floor is full");
        }else
            System.out.println("Your floor is:" + floor + "Your Slot Id is:" + slotid);
    }
}
class FourWheelers extends Vehicle{
    Short floor;
    void floor(short floor) {
        this.floor=floor;
        if (floor == 3 || floor == 4 || floor==6){
            System.out.println("You are on floor:" + floor + "This floor is for two wheeler.");
        } else
            System.out.println("You are on the wrong floor.");
    }
    void drive(){

    }
}
class HatchBack extends FourWheelers{
    Integer regno;
    Integer slotid;
    void drive(){
        if(slotid>30) {
            System.out.println("This floor is full");
        }else
            System.out.println("Your floor is:" + floor + "Your Slot Id is:" + slotid);
    }
}
class Sedan extends FourWheelers{
    Integer regno;
    Integer slotid;
    void drive(){
        if(slotid>30) {
            System.out.println("This floor is full");
        }else
            System.out.println("Your floor is:" + floor + "Your Slot Id is:" + slotid);
    }
}
class SUV extends FourWheelers{
    Integer regno;
    Integer slotid;
    void drive(){
        if(slotid>30) {
            System.out.println("This floor is full");
        }else
            System.out.println("Your floor is:" + floor + "Your Slot Id is:" + slotid);
    }
}
class SixWheelers extends Vehicle{
    Short floor;
    void floor(short floor) {
        this.floor=floor;
        if (floor == 0){
            System.out.println("You are on floor:" + floor + "This floor is for two wheeler.");
        } else
            System.out.println("You are on the wrong floor.");
    }
    Integer regno;
    Integer slotid;
    void drive(){
        if(slotid>30) {
            System.out.println("This floor is full");
        }else
            System.out.println("Your floor is:" + floor + "Your Slot Id is:" + slotid);
    }
}
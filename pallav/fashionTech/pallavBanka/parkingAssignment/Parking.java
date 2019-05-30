package fashionTech.pallavBanka.parkingAssignment;

import java.util.Date;

abstract class parking{
    void parkVehicle(vehicle v){
        int regno;
        short floor;
        int slotid;
        regno=v.regno;
        floor=v.floor;
        slotid=v.slotid;
    }
    void getVehicle(vehicle v,int regno){
        v.regno=regno;

    }
}
class vehicle extends parking{
    int regno;
    short floor;
    int slotid;
    void drive(){

    }
}
class twoWheelers extends vehicle{
    short floor;
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
class scooties extends twoWheelers{
    int regno;
    Date inTime;
    Date outTime;
    int slotid;
    void drive(){
        if(slotid>30) {
            System.out.println("This floor is full");
        }else
            System.out.println("Your floor is:" + floor + "Your Slot Id is:" + slotid);
    }
}
class cycle extends twoWheelers{
    int regno;
    Date inTime;
    Date outTime;
    int slotid;
    void drive(){
        if(slotid>30) {
            System.out.println("This floor is full");
        }else
            System.out.println("Your floor is:" + floor + "Your Slot Id is:" + slotid);
    }
}
class sportsBike extends twoWheelers{
    int regno;
    Date inTime;
    Date outTime;
    int slotid;
    void drive(){
        if(slotid>30) {
            System.out.println("This floor is full");
        }else
            System.out.println("Your floor is:" + floor + "Your Slot Id is:" + slotid);
    }
}
class cruiserBike extends twoWheelers{
    int regno;
    Date inTime;
    Date outTime;
    int slotid;
    void drive(){
        if(slotid>30) {
            System.out.println("This floor is full");
        }else
            System.out.println("Your floor is:" + floor + "Your Slot Id is:" + slotid);
    }
}
class fourWheelers extends vehicle{
    short floor;
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
class hatchBack extends fourWheelers{
    int regno;
    Date inTime;
    Date outTime;
    int slotid;
    void drive(){
        if(slotid>30) {
            System.out.println("This floor is full");
        }else
            System.out.println("Your floor is:" + floor + "Your Slot Id is:" + slotid);
    }
}
class sedan extends fourWheelers{
    int regno;
    Date inTime;
    Date outTime;
    int slotid;
    void drive(){
        if(slotid>30) {
            System.out.println("This floor is full");
        }else
            System.out.println("Your floor is:" + floor + "Your Slot Id is:" + slotid);
    }
}
class sUV extends fourWheelers{
    int regno;
    Date inTime;
    Date outTime;
    int slotid;
    void drive(){
        if(slotid>30) {
            System.out.println("This floor is full");
        }else
            System.out.println("Your floor is:" + floor + "Your Slot Id is:" + slotid);
    }
}
class sixWheelers extends vehicle{
    short floor;
    void floor(short floor) {
        this.floor=floor;
        if (floor == 0){
            System.out.println("You are on floor:" + floor + "This floor is for two wheeler.");
        } else
            System.out.println("You are on the wrong floor.");
    }
    int regno;
    Date inTime;
    Date outTime;
    int slotid;
    void drive(){
        if(slotid>30) {
            System.out.println("This floor is full");
        }else
            System.out.println("Your floor is:" + floor + "Your Slot Id is:" + slotid);
    }
}
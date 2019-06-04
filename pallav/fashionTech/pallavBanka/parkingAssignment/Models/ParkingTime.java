package fashionTech.pallavBanka.parkingAssignment.Models;

import java.util.Date;

public class ParkingTime {
    static Date inTime, outTime;

    public ParkingTime(Date inTime){
        this.inTime=inTime;
    }
    public static Date getInTime() {
        return inTime;
    }

    public static Date getOutTime() {
        return outTime;
    }

    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }

}

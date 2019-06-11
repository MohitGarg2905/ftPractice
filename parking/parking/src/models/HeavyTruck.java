package models;
import constant.VehicleType;
import models.SixWheelers;

public class HeavyTruck extends SixWheelers {  
	String regNumber;
	
	public HeavyTruck(String regNumber){
		super(regNumber);
		regNumber = getRegnumber(); 
	}
	
	void drive(){
		   System.out.println("I am driving Heavy Truck");
	   }
}

package models;
import constant.VehicleType;
import models.SixWheelers;

public class MiniTruck extends SixWheelers {  
	String regNumber;
	
	public MiniTruck(String regNumber){
		super(regNumber);
		regNumber = getRegnumber();  	 
	}
	
	void drive(){
		   System.out.println("I am driving Mini Truck");
	   }
}

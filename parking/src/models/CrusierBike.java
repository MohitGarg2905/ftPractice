package models;
import constant.VehicleType;
import models.TwoWheelers;

public class CrusierBike extends TwoWheelers {  
	String regNumber;
	
	public CrusierBike(String regNumber){
		super(regNumber);
		regNumber = getRegnumber();  

	}
	
	void drive(){
		   System.out.println("I am driving Crusier Bike");
	   }
}

package models;
import constant.VehicleType;
import models.TwoWheelers;

public class Bike extends TwoWheelers {  
	String regNumber;
	
	public Bike(String regNumber){
		super(regNumber);
		regNumber = getRegnumber();  	 
	}
	
	void drive(){
		   System.out.println("I am driving Bike");
	   }
}

package models;
import constant.VehicleType;
import models.TwoWheelers;

public class Scooter extends TwoWheelers {  
	String regNumber;
	
	public Scooter(String regNumber){
		super(regNumber);
		regNumber = getRegnumber();  
	}
	
	void drive(){
		   System.out.println("I am driving Scooter");
	   }
}

package models;
import constant.VehicleType;
import models.TwoWheelers;

public class Cycle extends TwoWheelers {  
	String regNumber;
	
	public Cycle(String regNumber){
		super(regNumber);
		regNumber = getRegnumber();
		setWheels(2);
	}
	
	
	
	void drive(){
		   System.out.println("I am driving Cycle");
	   }
}

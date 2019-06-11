package models;
import constant.VehicleType;
import models.FourWheelers;

public class NormalCar extends FourWheelers {  
	String regNumber;
	
	public NormalCar(String regNumber){
		super(regNumber);
		regNumber = getRegnumber();  
	}
	
	void drive(){
		   System.out.println("I am driving Car");
	   }
}

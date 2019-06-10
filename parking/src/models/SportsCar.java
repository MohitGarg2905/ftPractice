package models;
import constant.VehicleType;
import models.FourWheelers;

public class SportsCar extends FourWheelers {  
	String regNumber;
	
	public SportsCar(String regNumber){
		super(regNumber);
		regNumber = getRegnumber();  	 
	}
	
	void drive(){
		   System.out.println("I am driving SportsCar");
	   }
}

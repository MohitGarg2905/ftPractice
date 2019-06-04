package vehicles;
import vehicles.TwoWheelers;

public class Bike extends TwoWheelers {  
	String regNumber;
	
	public Bike(String regNumber){
		regNumber = getRegnumber();  	 
	}
	
	void drive(){
		   System.out.println("I am driving Bike");
	   }
}

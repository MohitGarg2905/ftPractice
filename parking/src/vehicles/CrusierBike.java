package vehicles;
import vehicles.TwoWheelers;

public class CrusierBike extends TwoWheelers {  
	String regNumber;
	
	public CrusierBike(String regNumber){
		regNumber = getRegnumber();  	 
	}
	
	void drive(){
		   System.out.println("I am driving Crusier Bike");
	   }
}

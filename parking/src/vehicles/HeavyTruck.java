package vehicles;
import vehicles.SixWheelers;

public class HeavyTruck extends SixWheelers {  
	String regNumber;
	
	public HeavyTruck(String regNumber){
		regNumber = getRegnumber();  	 
	}
	
	void drive(){
		   System.out.println("I am driving Heavy Truck");
	   }
}

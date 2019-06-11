package vehicles;
import vehicles.SixWheelers;

public class MiniTruck extends SixWheelers {  
	String regNumber;
	
	public MiniTruck(String regNumber){
		regNumber = getRegnumber();  	 
	}
	
	void drive(){
		   System.out.println("I am driving Mini Truck");
	   }
}

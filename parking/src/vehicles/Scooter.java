package vehicles;
import vehicles.TwoWheelers;

public class Scooter extends TwoWheelers {  
	String regNumber;
	
	public Scooter(String regNumber){
		regNumber = getRegnumber();  	 
	}
	
	void drive(){
		   System.out.println("I am driving Scooter");
	   }
}

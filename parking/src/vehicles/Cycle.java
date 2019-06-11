package vehicles;
import vehicles.TwoWheelers;

public class Cycle extends TwoWheelers {  
	String regNumber;
	
	public Cycle(String regNumber){
		regNumber = getRegnumber();  	 
	}
	
	void drive(){
		   System.out.println("I am driving Cycle");
	   }
}

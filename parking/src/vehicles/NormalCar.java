package vehicles;
import vehicles.FourWheelers;

public class NormalCar extends FourWheelers {  
	String regNumber;
	
	public NormalCar(String regNumber){
		regNumber = getRegnumber();  	 
	}
	
	void drive(){
		   System.out.println("I am driving Car");
	   }
}

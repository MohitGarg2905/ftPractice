package vehicles;
import vehicles.FourWheelers;

public class SportsCar extends FourWheelers {  
	String regNumber;
	
	public SportsCar(String regNumber){
		regNumber = getRegnumber();  	 
	}
	
	void drive(){
		   System.out.println("I am driving SportsCar");
	   }
}

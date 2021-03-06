package parking;

import java.util.*;
import java.lang.NumberFormatException;
class Vehicle{
	Integer wheels, typeInt;
	Integer floorNumber;
	String plateNumber, typeString, inTime, outTime;;
}

//class inOut extends Vehicle{
//	String in_time,out_time;
//}

//wheel2
//floor 0 Scooties (0) and cycle (1)
//floor 1 Sports Bike (2),cruiser bike (3)
//wheel4
//floor 2 Normal_Cars(4)
//floor 3 Sports_Cars (5)
//whell6
//floor 4 mini_truck(6)
//floor 5 heavy_truck (7)

public class parking {
	    //integer corresponding to vehicle
    private static Hashtable<Integer,String> typeInt = new Hashtable<Integer,String>() {{ put(0, "scooties");
																					    put(1, "cycle");
																					    put(2, "sports_bike");
																					    put(3, "cruiser_bike");
																					    put(4, "normal_car");
																					    put(5, "sports_car");
																					    put(6, "mini_truck");
																					    put(7, "heavy_truck");
																					 }};
       //wheels corresponding to vehicle
    private static Hashtable<String,Integer> typeString = new Hashtable<String,Integer>() {{ put("scooties", 2);
																				        put("cycle", 2);
																				        put("sports_bike", 2);
																				        put("cruiser_bike", 2);
																				        put("normal_car", 4);
																				        put("sports_car", 4);
																				        put("mini_truck", 6);
																				        put("heavy_truck", 6);
																				     }};
		//floor corresponding to vehicle		
		//If new changes are required put new floorNumbers 																		     
    private static Hashtable<String,Integer> floorNumbers = new Hashtable<String,Integer>() {{ put("scooties", 0);
																				        put("cycle", 0);
																				        put("sports_bike", 1);
																				        put("cruiser_bike", 1);
																				        put("normal_car", 2);
																				        put("sports_car", 3);
																				        put("mini_truck", 4);
																				        put("heavy_truck", 5);
																				     }};
																     
    public static Integer[] parkVehicle(Vehicle vehicle, int count) {	
    	 
    	 //a = wheels
    	 //b = floorNumber
    	 //c = slot
    	
    	 Integer ID[] = new Integer[3];
    	 ID[0] = vehicle.wheels;
    	 ID[1] = vehicle.floorNumber;
    	 ID[2] = count;
    	 return ID;          	
     }		
    
    public static Double getVehicle(Vehicle vehicle) {	
   	    Integer cost = 0;
   	// 09 30 01 03 2019
    // 0  1  2  3   4
   	    Double [] arrIn = new Double [5];   
   	    Double [] arrOut = new Double [5];
    	String inStr = vehicle.inTime; 
    	String[] arrInStrDay = inStr.split(" ", 2);  // 01-03-2019 09:30
    	String[] arrInStrDate = arrInStrDay[0].split("-", 3);
    	String[] arrInStr = arrInStrDay[1].split(":", 2);
    	arrIn[0] = Integer.parseInt(arrInStr[0]) + 0.00;
    	arrIn[1] = Integer.parseInt(arrInStr[1]) + 0.00;
    	arrIn[2] = Integer.parseInt(arrInStrDate[0]) + 0.00;
    	arrIn[3] = Integer.parseInt(arrInStrDate[1]) + 0.00;
    	arrIn[4] = Integer.parseInt(arrInStrDate[2]) + 0.00;
    	String outStr = vehicle.outTime;
    	String[] arrOutStrDay = outStr.split(" ", 2);
    	String[] arrOutStrDate = arrOutStrDay[0].split("-", 3);
    	String[] arrOutStr = arrOutStrDay[1].split(":", 2);
    	arrOut[0] = Integer.parseInt(arrOutStr[0]) + 0.00;   //int of 09 string 09:00
    	arrOut[1] = Integer.parseInt(arrOutStr[1]) + 0.00;   // int of 00 string from 09:00
    	arrOut[2] = Integer.parseInt(arrOutStrDate[0]) + 0.00;
    	arrOut[3] = Integer.parseInt(arrOutStrDate[1]) + 0.00;
    	arrOut[4] = Integer.parseInt(arrOutStrDate[2]) + 0.00;
    	//1 unit for every half hour
    	cost = cost + (arrOut[0]-arrIn[0]) + (arrOut[1]-arrIn[1])/(60) + (arrOutStrDate[0]-arrInStrDate[0])*(24) + (arrOutStrDate[1]-arrInStrDate[1])*(24)*(30) + (arrOutStrDate[2]-arrInStrDate[2])*(24)*(30)*(12) + 0.00 ;
    	
    	
    	
   	 return cost;          	
    }	
	
	public static void main(String[] args) {
		
		ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
		Scanner in = new Scanner(System.in);
		  
	      for(int i = 0;i < 2;i++) {
	    	  Vehicle tempVehicle = new Vehicle();
	    	  tempVehicle.plateNumber = in.next();
	    	  tempVehicle.typeInt = in.nextInt();  //integer corresponding to vehicle type
	    	  tempVehicle.typeString = typeInt.get(tempVehicle.typeInt);  //Vehicle 
	    	  tempVehicle.wheels = typeString.get(tempVehicle.typeString);  //wheels
	    	  tempVehicle.floorNumber = floorNumbers.get(tempVehicle.typeString);  //floor number
	    	  tempVehicle.inTime = in.next();            
	    	  Integer[] CarId = parkVehicle(tempVehicle,i);
	    	  System.out.println(tempVehicle.typeString);
	    	  //for(int p=0;p<3;p++)
	    	  //	{System.out.print(Car_id[p]);}
	    	  //System.out.print(tempVehicle.in_time(0));
	    	  vehicleList.add(tempVehicle);
	    	  tempVehicle.outTime = in.next();
	    	  Double netCost = getVehicle(tempVehicle);
	    	  System.out.print(netCost);
	      }
	      
	}

}



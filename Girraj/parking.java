package javaapplication1;
import java.util.*; 

class Vehicle{
	int wheels, type_int;
	String plate_number, in_time, type_string;
}

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
	    
    private static Hashtable<Integer,String> type_int = new Hashtable<Integer,String>() {{ put(0, "scooties");
			                                                                   put(1, "cycle");
										           put(2, "sports_bike");
											   put(3, "cruiser_bike");
											   put(4, "normal_car");
											   put(5, "sports_car");
											   put(6, "mini_truck");
											   put(7, "heavy_truck");
											 }};
    
    private static Hashtable<String,Integer> type_string = new Hashtable<String,Integer>() {{ put("scooties", 2);
											      put("cycle", 2);
											      put("sports_bike", 2);
											      put("cruiser_bike", 2);
											      put("normal_car", 4);
											      put("sports_car", 4);
											      put("mini_truck", 6);
											      put("heavy_truck", 6);
												}};
    
//     public static String id_generator(Vehicle vehicle,int floor_number) {	
//     	 String ID;
    	           	
//      }																	     
																				     
    public static int parkVehicle(Vehicle vehicle) {
    	
		int floor_number = 0;
		
    	if(vehicle.wheels == 2) {
    		if(vehicle.type_int == 0 || vehicle.type_int == 1)
    			floor_number = 0;
    		else if(vehicle.type_int == 2 || vehicle.type_int == 3)
    			floor_number = 1;
    	}
			
    	else if(vehicle.wheels == 4) {
    		if(vehicle.type_int == 4)
    			floor_number = 2;
    		else if(vehicle.type_int == 5)
    			floor_number = 3;
    	}
			
    	else if(vehicle.wheels == 6) {
    		if(vehicle.type_int == 6)
    			floor_number = 4;
    		else if(vehicle.type_int == 7)
    			floor_number = 5;
    	}
    	
    	return floor_number;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Vehicle> vehicle_list = new ArrayList<Vehicle>();
		Scanner in = new Scanner(System.in);
		  
	      for(int i = 0;i < 2;i++) {
	    	  Vehicle temp = new Vehicle();
	    	  temp.plate_number = in.next();
	    	  temp.type_int = in.nextInt();
	    	  temp.type_string = type_int.get(temp.type_int);
	    	  temp.wheels = type_string.get(temp.type_string);
	    	  temp.in_time = in.next();
	    	  int floor_number = parkVehicle(temp);
	    	  System.out.println(temp.type_string);
	    	  System.out.println(floor_number);
	    	  vehicle_list.add(temp);
	      }
	      
	}

}


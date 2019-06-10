package models;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.Map;

import constant.VehicleType;

public class ParkingLot {

	protected static ArrayList<String> occupied =   new ArrayList<String>();
	protected static Map<VehicleType.VehicleTypes,ArrayList<Integer>> VehicleTypeWiseFloor = new HashMap<VehicleType.VehicleTypes,ArrayList<Integer>>();
	protected static Map<Integer, Integer> slotStatusFloor0 = new HashMap<Integer, Integer>();
	protected static Map<Integer, Integer> slotStatusFloor1 = new HashMap<Integer, Integer>();
	protected static Map<Integer, Integer> slotStatusFloor2 = new HashMap<Integer, Integer>();
	protected static Map<Integer, Integer> slotStatusFloor3 = new HashMap<Integer, Integer>();
	protected static Map<Integer, Integer> slotStatusFloor4 = new HashMap<Integer, Integer>();
	protected static Map<Integer, Integer> slotStatusFloor5 = new HashMap<Integer, Integer>();
	protected static Map<Integer, Integer> slotStatusFloor6 = new HashMap<Integer, Integer>();
	protected static Map<Integer, Integer> FloorStatus = new HashMap<Integer, Integer>();
	
	
	//creating slots for each floor
	public static void makeParkingLot(){
		
							ArrayList<Integer> twoWheelerFloors = new ArrayList<Integer>();    	
						    ArrayList<Integer> fourWheelerFloors = new ArrayList<Integer>();
						    ArrayList<Integer> sixWheelerFloors = new ArrayList<Integer>();
							
						    twoWheelerFloors.add(0);
						    twoWheelerFloors.add(1);
						    twoWheelerFloors.add(2);
						    fourWheelerFloors.add(3);
						    fourWheelerFloors.add(4);
						    sixWheelerFloors.add(5);
						    sixWheelerFloors.add(6);
						    
						    VehicleTypeWiseFloor.put(VehicleType.VehicleTypes.twoWheeler, twoWheelerFloors);
						    VehicleTypeWiseFloor.put(VehicleType.VehicleTypes.fourWheeler, fourWheelerFloors);
						    VehicleTypeWiseFloor.put(VehicleType.VehicleTypes.sixWheeler, sixWheelerFloors);
						    
						    //Initializing slotkeyForEachFloor
						    for(int i=0; i<10;i++){
									    	//slotkeyForEachFloor.add(i, 0);
									    	slotStatusFloor0.put(i, 0);
									    	slotStatusFloor1.put(i, 0);
									    	slotStatusFloor2.put(i, 0);
									    	slotStatusFloor3.put(i, 0);
									    	slotStatusFloor4.put(i, 0);
									    	slotStatusFloor5.put(i, 0);
									    	slotStatusFloor6.put(i, 0);
									    	FloorStatus.put(i, 0);
						    }
  
	}
	
}

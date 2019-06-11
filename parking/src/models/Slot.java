package models;

import java.util.*;
import models.ParkingLot;
import models.Vehicle;
import constant.VehicleType;
import models.Time;

public class Slot {
	public static Map<String, Integer> FloorCorrespondingToslotId = new HashMap<String, Integer>();
	public static Map<String, Integer> SlotCorrespondingToslotId = new HashMap<String, Integer>();
	public static Map<String, String> SlotIdCorrespondingToRegNumber = new HashMap<String, String>();
	public static Map<String, Time> TimeCorrespondingToSlotId = new HashMap<String, Time>();
	
	public static String slotId(Vehicle vehicle) {	
   	
		VehicleType.VehicleTypes vType =  vehicle.getVehicleType();	
   	//Id generator
	String slotId = UUID.randomUUID().toString();
	    
 	//try to give slot
   	 boolean checkSlotOccupied = ParkingLot.occupied.contains(slotId); 
        if (checkSlotOccupied)
        {
       	 System.out.println("slotoccupied");
        }
        else
        {   	 if(vType == VehicleType.VehicleTypes.twoWheeler)
        			{ 
        	              if( ParkingLot.FloorStatus.get(0) == 0 )
        	              {
        	            	  for(int j=0 ; j<10;j++)
        	            	  {	
        	            		  if(ParkingLot.slotStatusFloor0.get(j)==0)
        	            	  		{
        	            		         ParkingLot.occupied.add(slotId);
        	            		         FloorCorrespondingToslotId.put(slotId,0);
        	            		         SlotCorrespondingToslotId.put(slotId, j);
        	            	  		}
        	            	      
        	            	  }
        	              }
        	              
        	              else if( ParkingLot.FloorStatus.get(1) == 0 )
        	              {
        	            	  for(int j=0 ; j<10;j++)
        	            	  {	
        	            		  if(ParkingLot.slotStatusFloor1.get(j)==0)
        	            	  		{
        	            			  ParkingLot.occupied.add(slotId);
     	            		         FloorCorrespondingToslotId.put(slotId,1);
     	            		         SlotCorrespondingToslotId.put(slotId, j);            
        	            	  		}
        	            	  }
        	              }
        	              
        	              else if( ParkingLot.FloorStatus.get(2) == 0 )
        	              {
        	            	  for(int j=0 ; j<10;j++)
        	            	  {	
        	            		  if(ParkingLot.slotStatusFloor2.get(j)==0)
        	            	  		{
        	            			  ParkingLot.occupied.add(slotId);
     	            		         FloorCorrespondingToslotId.put(slotId,2);
     	            		         SlotCorrespondingToslotId.put(slotId, j);            
        	            	  		}
        	            	      
        	            	  }
        	              }
        	              else
        	        		{
        	        			System.out.println("ParkingFull");
        	        		}
        			 }
        
        
        		else if(vType == VehicleType.VehicleTypes.fourWheeler)
        		{
        			if( ParkingLot.FloorStatus.get(3) == 0 )
  	              	{
  	            	  for(int j=0 ; j<10;j++)
  	            	  {	
  	            		  if(ParkingLot.slotStatusFloor3.get(j)==0)
  	            	  		{
  	            			  	ParkingLot.occupied.add(slotId);
  	            			  	FloorCorrespondingToslotId.put(slotId,3);
  	            			  	SlotCorrespondingToslotId.put(slotId, j);            
  	            	  		}
  	            	      
  	            	  }
  	              	}
        			else if( ParkingLot.FloorStatus.get(4) == 0 )
    	              {
    	            	  for(int j=0 ; j<10;j++)
    	            	  {	
    	            		  if(ParkingLot.slotStatusFloor4.get(j)==0)
    	            	  		{
    	            			  	ParkingLot.occupied.add(slotId);
    	            			  	FloorCorrespondingToslotId.put(slotId,4);
    	            			  	SlotCorrespondingToslotId.put(slotId, j);              
    	            	  		}  
    	            	  }
    	              }
        			else
	        		{
	        			System.out.println("ParkingFull");
	        		}	
        		}
             
        		else if(vType == VehicleType.VehicleTypes.sixWheeler)
        		{
        			if( ParkingLot.FloorStatus.get(5) == 0 )
  	              	{
  	            	  for(int j=0 ; j<10;j++)
  	            	  {	
  	            		  if(ParkingLot.slotStatusFloor5.get(j)==0)
  	            	  		{
  	            			  	ParkingLot.occupied.add(slotId);
	            			  	FloorCorrespondingToslotId.put(slotId,5);
	            			  	SlotCorrespondingToslotId.put(slotId, j);              
  	            	  		}
  	            	      
  	            	  }
  	              	}
        			else if( ParkingLot.FloorStatus.get(6) == 0 )
    	              {
    	            	  for(int j=0 ; j<10;j++)
    	            	  {	
    	            		  if(ParkingLot.slotStatusFloor6.get(j)==0)
    	            	  		{
    	            			  	ParkingLot.occupied.add(slotId);
    	            			  	FloorCorrespondingToslotId.put(slotId,6);
    	            			  	SlotCorrespondingToslotId.put(slotId, j);              
    	            	  		}  
    	            	  }
    	              }
        			else
	        		{
	        			System.out.println("ParkingFull");
	        		}
        		}
             
        }   
        SlotIdCorrespondingToRegNumber.put(vehicle.getRegnumber(),slotId);
        TimeCorrespondingToSlotId.put(slotId,Time.getInTime());
        return slotId;
    }	
		
}

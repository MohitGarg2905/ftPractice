package services;

import services.ParkingService;
import models.Vehicle;
import models.Slot;
import models.Cycle;
import models.Floor;
import java.util.Date;

public class ParkVehicleServiceImpl implements ParkingService {
    
	public void parkVehicleService(Vehicle vehicle){
		
		String slotId = Slot.slotId(vehicle);
		Integer FloorForVehicle = Slot.FloorCorrespondingToslotId.get(slotId);
        Integer SlotForVehicle =  Slot.SlotCorrespondingToslotId.get(slotId);
        }	
	
	public String getVehicle(String regNumber){
		  String SlotIdCorrespondingToRegNumber =  Slot.SlotIdCorrespondingToRegNumber.get(regNumber);
		  Integer FloorOfVehicle = Slot.FloorCorrespondingToslotId.get(SlotIdCorrespondingToRegNumber);
	      Integer SlotFOfVehicle =  Slot.SlotCorrespondingToslotId.get(SlotIdCorrespondingToRegNumber);
		  
		  return SlotIdCorrespondingToRegNumber;
	}
	
	public Long removeVehicleAndGetDuration(String regNumber){
		  
		if(Slot.SlotIdCorrespondingToRegNumber.get(regNumber)== null)
		{   Vehicle vehicle = new Cycle(regNumber);
			String slotId = Slot.slotId(vehicle);
			Integer FloorForVehicle = Slot.FloorCorrespondingToslotId.get(slotId);
	        Integer SlotForVehicle =  Slot.SlotCorrespondingToslotId.get(slotId);
		}
		else
		     {  
		  String SlotIdCorrespondingToRegNumber =  Slot.SlotIdCorrespondingToRegNumber.get(regNumber);
		  Integer FloorOfVehicle = Slot.FloorCorrespondingToslotId.get(SlotIdCorrespondingToRegNumber);
	      Integer SlotFOfVehicle =  Slot.SlotCorrespondingToslotId.get(SlotIdCorrespondingToRegNumber);
	      
	      Slot.FloorCorrespondingToslotId.remove(SlotIdCorrespondingToRegNumber);
	      Slot.SlotCorrespondingToslotId.remove(SlotIdCorrespondingToRegNumber);
	      Slot.SlotIdCorrespondingToRegNumber.remove(regNumber);
	      Date out = new Date();
	      Long duration = out.getTime() - Slot.TimeCorrespondingToSlotId.get(SlotIdCorrespondingToRegNumber);
	      return duration;
	      }
		
	}
	   
}

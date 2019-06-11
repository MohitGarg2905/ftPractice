package services;



import constant.VehicleType.VehicleTypes;
import dao.ChargesDao;
import services.ChargesService;

public class ChargesServiceImpl implements ChargesService {
                  
      	private ChargesDao chargesdao = new ChargesDao();

		public Integer calculateCharges(VehicleTypes vehicleType, long duration) throws Exception {
			// TODO Auto-generated method stub
			Integer perHourcharge = chargesdao.getChargesByVehilcTypes(vehicleType);
	      	//Using Math.Floor so that we can get the higher value of time. Even if vehicle was parked for 20 mins, charges are applicable for full hour.
	            int timeInHours = new Double(Math.floor(duration/3600)).intValue();
	            return timeInHours*perHourcharge;
		}
	
}

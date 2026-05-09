package parkingLot.model;

import java.util.List;

public class ParkingFloor {

    int id;
    int floorNumber;
    List<VehicleType> floorAllowedVehicles;

    Status floorStatus;
    List<ParkingSlot> slots;


}

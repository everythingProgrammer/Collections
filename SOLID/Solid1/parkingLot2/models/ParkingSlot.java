package parkingLot2.models;

import java.util.Date;
import java.util.List;

public class ParkingSlot extends BaseModel
{
    public ParkingSlot(int id, Date createdAt, Date updatedAt) {
        super(id, createdAt, updatedAt);
    }

    private String slotNumber;
    private ParkingSlotStatus parkingSlotStatus;
    private List<SupportedVehicleType> vehicleTypes; // vehicles that can park into a specific slots , each slot defines which vehicle can park in it .
    private ParkingFloor parkingFloor;
    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }
    //    private Vehicle vehicle;

    public String getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(String slotNumber) {
        this.slotNumber = slotNumber;
    }

    public ParkingSlotStatus getParkingSlotStatus() {
        return parkingSlotStatus;
    }

    public void setParkingSlotStatus(ParkingSlotStatus parkingSlotStatus) {
        this.parkingSlotStatus = parkingSlotStatus;
    }

    public List<SupportedVehicleType> getVehicleTypes() {
        return vehicleTypes;
    }

    public void setVehicleTypes(List<SupportedVehicleType> vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }

}

package parkingLot2.models;

public class Vehicle {


    private int number;
    private VehicleType vehicleType;
    private String ownerName;


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Vehicle(int number, VehicleType vehicleType, String ownerName) {
        this.number = number;
        this.vehicleType = vehicleType;
        this.ownerName = ownerName;
    }
}

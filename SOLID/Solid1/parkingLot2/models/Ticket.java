package parkingLot2.models;

import java.util.Date;

public class Ticket extends BaseModel{
    private Date entryTime;
    private Gate gate;
    // Gate will contain the current Operator at the gate
    // this operator will contain the operator details who was present at the gate when ticket was cut
    private Operator operator;
    private ParkingSlot parkingSlot;
    private Vehicle vehicle;
    private String ownerName;

    public Ticket(int id, Date createdAt, Date updatedAt, Date entryTime, Gate gate, Operator operator, ParkingSlot parkingSlot, Vehicle vehicle, String ownerName) {
        super(id, createdAt, updatedAt);
        this.entryTime = entryTime;
        this.gate = gate;
        this.operator = operator;
        this.parkingSlot = parkingSlot;
        this.vehicle = vehicle;
        this.ownerName = ownerName;
    }
    public Ticket() {
        super(0, new Date(), new Date()); // or handle BaseModel fields appropriately
    }
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Ticket(int id, Date createdAt, Date updatedAt) {
        super(id, createdAt, updatedAt);
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}

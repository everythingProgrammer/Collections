package parkingLot2.services;

import parkingLot2.models.Ticket;
import parkingLot2.models.VehicleType;

import java.util.Date;

public class TicketService {
    public Ticket issueTicket(int gateId, String vehicleNumber,
                              String ownerName,
                              VehicleType vehicleType){


        // Create Tickte Object what data exactly is required

        // 1. Properly create the ticket object with requried parameters
        // 2. Assign Slot
        // 3. Return the data

        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());
        return null;
    }
}

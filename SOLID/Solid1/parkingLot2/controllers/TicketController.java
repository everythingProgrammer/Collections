package parkingLot2.controllers;

import parkingLot2.dtos.IssueTicketRequestDTO;
import parkingLot2.dtos.IssueTicketResponseDTO;
import parkingLot2.dtos.ResponseStatus;
import parkingLot2.models.Ticket;
import parkingLot2.services.TicketService;

public class TicketController {

    private TicketService ticketService;

    TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }

    IssueTicketResponseDTO issueTicket(IssueTicketRequestDTO request){
        IssueTicketResponseDTO response = new IssueTicketResponseDTO();
        try {
            Ticket ticket = ticketService.issueTicket(request.getGateId(),
                    request.getVehicleNumber(),
                    request.getOwnerName(),
                    request.getVehicleType());

            response.setResponseStatus(ResponseStatus.SUCCESS);
            response.setTicketId(ticket.getId());
        }catch(Exception e){
            response.setResponseStatus(ResponseStatus.FAILURE);
            response.setFailureMessage(e.getMessage());
        }

        return response;
    }
}

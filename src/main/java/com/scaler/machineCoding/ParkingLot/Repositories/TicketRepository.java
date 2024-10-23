package com.scaler.machineCoding.ParkingLot.Repositories;

import com.scaler.machineCoding.ParkingLot.models.Ticket;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class TicketRepository {

    private Map<Long,Ticket> tickets = new HashMap<>();
    private long previousTicketId=0L;
    public Ticket save(Ticket ticket) {
        if(ticket.getId()==0){
            previousTicketId++;
            ticket.setId(previousTicketId);
            tickets.put(ticket.getId(), ticket);
        }
        return ticket;
    }
}

package com.scaler.machineCoding.ParkingLot.Controller;

import com.scaler.machineCoding.ParkingLot.DTOs.IssueTicketRequestDto;
import com.scaler.machineCoding.ParkingLot.DTOs.IssueTicketResponseDto;
import com.scaler.machineCoding.ParkingLot.Services.TicketService;

public class TicketController {

    private TicketService ticketService;
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponseDto getTicket(IssueTicketRequestDto issueTicketRequestDto) {
         ticketService.issueTicket(issueTicketRequestDto.getGateId(),issueTicketRequestDto.getVehicleType(),issueTicketRequestDto.getOwnerName(),issueTicketRequestDto.getVehicleNo());
         return null;
    }
}

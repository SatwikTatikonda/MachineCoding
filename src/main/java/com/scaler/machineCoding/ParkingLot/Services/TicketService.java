package com.scaler.machineCoding.ParkingLot.Services;

import com.scaler.machineCoding.ParkingLot.Factory.SpotAssignmentFactory;
import com.scaler.machineCoding.ParkingLot.Repositories.GateRepository;
import com.scaler.machineCoding.ParkingLot.Repositories.ParkingLotRepository;
import com.scaler.machineCoding.ParkingLot.Repositories.TicketRepository;
import com.scaler.machineCoding.ParkingLot.Repositories.VehicleRepository;
import com.scaler.machineCoding.ParkingLot.Strategies.SpotAssigmentStrategy;
import com.scaler.machineCoding.ParkingLot.models.*;

import java.util.Optional;

public class TicketService {

    GateRepository gateRepository;
    VehicleRepository vehicleRepository;
    TicketRepository ticketRepository;
    ParkingLotRepository parkingLotRepository;

    public TicketService(GateRepository gateRepository, VehicleRepository vehicleRepository,TicketRepository ticketRepository, ParkingLotRepository parkingLotRepository) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.ticketRepository = ticketRepository;
        this.parkingLotRepository = parkingLotRepository;
    }
    public Ticket issueTicket(long gateID, VehicleType vehicleType,String ownerName,String vehicleNo) {

        Ticket ticket =new Ticket();
        Optional<Gate> gateOptional=gateRepository.findGateById(gateID);
        if(!gateOptional.isPresent()){
            throw new RuntimeException("Gate not found");
        }
        Gate gate=gateOptional.get();
        ticket.setGate(gate);

        Optional<Vehicle>vehicleOptional=vehicleRepository.findByVehicleType(vehicleType);
        if(vehicleOptional.isEmpty()){
            Vehicle vehicle=new Vehicle();
            vehicle.setVehicleType(vehicleType);
            ticket.setVehicle(vehicleRepository.save(vehicle));
        }
        else{
            ticket.setVehicle(vehicleOptional.get());
        }

        Optional<ParkingLot>parkingLotOptional=parkingLotRepository.getParkingLotById(gateID);
        if(!parkingLotOptional.isPresent()){
            throw new RuntimeException("ParkingLot not found");
        }
        ParkingLot parkingLot=parkingLotOptional.get();
        SpotAssignmentStrategyType type=parkingLot.getSpotAssignmentStrategyType();
        SpotAssigmentStrategy spotAssigmentStrategy= SpotAssignmentFactory.getSpotAssigmentStrategy(type);
        ParkingSpot ps=spotAssigmentStrategy.assignSpot(vehicleType,gateID);

        ticket.setParkingSpot(ps);

        return ticket;
    }
}

package com.scaler.machineCoding.ParkingLot.Strategies;

import com.scaler.machineCoding.ParkingLot.models.ParkingSpot;
import com.scaler.machineCoding.ParkingLot.models.VehicleType;

public class RandomSpotAssignmentStrategy implements SpotAssigmentStrategy{
    @Override
    public ParkingSpot assignSpot(VehicleType vehicleType, long gateId) {
//       get parking lot from repo using gate id and pick random parking spot for the vehicle types
        return null;
    }
}

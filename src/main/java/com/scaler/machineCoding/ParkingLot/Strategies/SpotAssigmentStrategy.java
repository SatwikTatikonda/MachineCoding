package com.scaler.machineCoding.ParkingLot.Strategies;

import com.scaler.machineCoding.ParkingLot.models.ParkingLot;
import com.scaler.machineCoding.ParkingLot.models.ParkingSpot;
import com.scaler.machineCoding.ParkingLot.models.VehicleType;

public interface SpotAssigmentStrategy {

        ParkingSpot assignSpot(VehicleType vehicleType, long gateId);

}

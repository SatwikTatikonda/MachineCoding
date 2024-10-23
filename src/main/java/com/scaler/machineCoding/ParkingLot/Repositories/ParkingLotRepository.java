package com.scaler.machineCoding.ParkingLot.Repositories;

import com.scaler.machineCoding.ParkingLot.models.ParkingLot;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ParkingLotRepository {

    private Map<Long, ParkingLot> parkingLotMap = new HashMap<>();
    public Optional<ParkingLot> getParkingLotById(long id) {

        if (parkingLotMap.containsKey(id)) {
            return Optional.of(parkingLotMap.get(id));
        }
        return Optional.empty();
    }
}

package com.scaler.machineCoding.ParkingLot.Factory;

import com.scaler.machineCoding.ParkingLot.Strategies.CheapestSpotAssignmentStrategy;
import com.scaler.machineCoding.ParkingLot.Strategies.RandomSpotAssignmentStrategy;
import com.scaler.machineCoding.ParkingLot.Strategies.SpotAssigmentStrategy;
import com.scaler.machineCoding.ParkingLot.models.SpotAssignmentStrategyType;

public class SpotAssignmentFactory {

    public static SpotAssigmentStrategy getSpotAssigmentStrategy(SpotAssignmentStrategyType type) {
        if (type.equals(SpotAssignmentStrategyType.CHEAPEST)) {

            return new CheapestSpotAssignmentStrategy();
        }
        else if(type.equals(SpotAssignmentStrategyType.RANDOM)){
            return new RandomSpotAssignmentStrategy();
        }
        return null;
    }
}

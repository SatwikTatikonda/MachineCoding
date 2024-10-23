package com.scaler.machineCoding.ParkingLot.DTOs;

import com.scaler.machineCoding.ParkingLot.models.VehicleType;

public class IssueTicketRequestDto {
    private long gateId;
    private String vehicleNo;
    private VehicleType vehicleType;
    private String ownerName;

    public long getGateId() {
        return gateId;
    }

    public void setGateId(long gateId) {
        this.gateId = gateId;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}

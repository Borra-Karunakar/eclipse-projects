package com.example.consumer.kafka;

public class RideMessage {
    private Long id;
    private String driverName;
    private String pickupLocation;
    private String dropLocation;
    private String status;
    private String operation; // CREATE, UPDATE, DELETE

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getDriverName() { return driverName; }
    public void setDriverName(String driverName) { this.driverName = driverName; }

    public String getPickupLocation() { return pickupLocation; }
    public void setPickupLocation(String pickupLocation) { this.pickupLocation = pickupLocation; }

    public String getDropLocation() { return dropLocation; }
    public void setDropLocation(String dropLocation) { this.dropLocation = dropLocation; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getOperation() { return operation; }
    public void setOperation(String operation) { this.operation = operation; }
}

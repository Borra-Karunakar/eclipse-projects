package com.example.consumer.model;

import jakarta.persistence.*;

@Entity
@Table(name = "rides")
public class Ride {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String driverName;
    private String pickupLocation;
    private String dropLocation;
    private String status;

    public Ride() {}

    public Ride(String driverName, String pickupLocation, String dropLocation, String status) {
        this.driverName = driverName;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
        this.status = status;
    }

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
}

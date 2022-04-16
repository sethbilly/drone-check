package com.check.drone.checkdrone.domain;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.check.drone.checkdrone.domain.constants.DroneModel;
import com.check.drone.checkdrone.domain.constants.DroneState;

@Entity
@Table(name="drones")
public class Drone implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "serial_number")
    private String serialNumber;

    @Column(name = "model")
    @Enumerated(EnumType.STRING)
    private DroneModel model;

    @Column(name = "weight_limit")
    private double weightLimit;

    @Column(name = "battery_capacity")
    private double batteryCapacity;

    @Column(name  = "state")
    @Enumerated(EnumType.STRING)
    private DroneState state;

    @OneToMany(mappedBy = "drone")
    private Set<Order> orders;


    public Drone() {
    }

    public Drone(String serialNumber, DroneModel model, double weightLimit, double batteryCapacity, DroneState state) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.weightLimit = weightLimit;
        this.batteryCapacity = batteryCapacity;
        this.state = state;
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public DroneModel getModel() {
        return this.model;
    }

    public void setModel(DroneModel model) {
        this.model = model;
    }

    public double getWeightLimit() {
        return this.weightLimit;
    }

    public void setWeightLimit(double weightLimit) {
        this.weightLimit = weightLimit;
    }

    public double getBatteryCapacity() {
        return this.batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public DroneState getState() {
        return this.state;
    }

    public void setState(DroneState state) {
        this.state = state;
    }


}

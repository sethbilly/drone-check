package com.check.drone.checkdrone.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


public class Order implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JoinColumn(name = "drone")
    @ManyToOne
    private Drone drone;

    @JoinColumn(name = "medication")
    @ManyToOne
    private Medication medication;

    public Order(Drone drone, Medication medication, LocalDateTime loadedAt) {
        this.drone = drone;
        this.medication = medication;
        this.loadedAt = loadedAt;
    }

    @Column(name = "loaded_at")
    private LocalDateTime loadedAt;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Drone getDrone() {
        return this.drone;
    }

    public void setDrone(Drone drone) {
        this.drone = drone;
    }

    public Medication getMedication() {
        return this.medication;
    }

    public void setMedication(Medication medication) {
        this.medication = medication;
    }

    public LocalDateTime getLoadedAt() {
        return this.loadedAt;
    }

    public void setLoadedAt(LocalDateTime loadedAt) {
        this.loadedAt = loadedAt;
    }




}

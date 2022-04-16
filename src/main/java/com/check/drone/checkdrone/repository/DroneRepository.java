package com.check.drone.checkdrone.repository;

import com.check.drone.checkdrone.domain.Drone;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DroneRepository extends JpaRepository<Drone, Long> {
}

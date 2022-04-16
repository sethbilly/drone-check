package com.check.drone.checkdrone.repository;

import com.check.drone.checkdrone.domain.Medication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicationRepository extends JpaRepository<Medication, Long>{
    
}

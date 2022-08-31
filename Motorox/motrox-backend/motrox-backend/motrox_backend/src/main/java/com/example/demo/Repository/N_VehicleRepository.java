package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.N_Vehicle;

@Repository
public interface N_VehicleRepository extends JpaRepository<N_Vehicle, Long> {

}

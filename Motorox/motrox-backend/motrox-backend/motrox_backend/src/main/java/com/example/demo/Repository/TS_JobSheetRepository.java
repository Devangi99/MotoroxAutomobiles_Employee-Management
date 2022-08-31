package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.TS_JobSheet;

@Repository
public interface TS_JobSheetRepository extends JpaRepository<TS_JobSheet, Long> {

}

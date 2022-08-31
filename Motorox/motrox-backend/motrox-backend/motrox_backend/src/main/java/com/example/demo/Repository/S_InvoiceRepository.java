package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.S_Invoice;

public interface S_InvoiceRepository extends JpaRepository<S_Invoice,Integer> {

}

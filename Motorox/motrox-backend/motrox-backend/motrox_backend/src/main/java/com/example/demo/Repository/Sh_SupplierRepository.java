package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Sh_Supplier;

@Repository
public interface Sh_SupplierRepository extends JpaRepository<Sh_Supplier, Long>{
	

}

package com.nsbm.mims.repository;

import com.nsbm.mims.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

//supplier repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}

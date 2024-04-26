package com.nsbm.mims.repository;

import com.nsbm.mims.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

//order repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
package com.nsbm.mims.repository;

import com.nsbm.mims.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//item repository
@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
package com.nsbm.mims.repository;

import com.nsbm.mims.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

//location repository
public interface LocationRepository extends JpaRepository<Location, Long> {
}

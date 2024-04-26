package com.nsbm.mims.repository;


import com.nsbm.mims.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//authentication repository
@Repository
public interface AuthRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}

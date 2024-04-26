package com.nsbm.mims.service.impl;

import com.nsbm.mims.model.User;
import com.nsbm.mims.repository.AuthRepository;
import com.nsbm.mims.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private AuthRepository authRepository;

    //find user by email service
    @Override
    public User findByEmail(String email) {
        return authRepository.findByEmail(email);
    }
}

package com.nsbm.mims.service;

import com.nsbm.mims.model.User;

//authentication
public interface AuthService {
    User findByEmail(String email);
}

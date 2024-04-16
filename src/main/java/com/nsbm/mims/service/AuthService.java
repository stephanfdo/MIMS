package com.nsbm.mims.service;

import com.nsbm.mims.model.User;

public interface AuthService {
    User findByEmail(String email);
}

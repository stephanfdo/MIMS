package com.nsbm.mims.service;

import com.nsbm.mims.model.User;

import java.util.List;
//user services
public interface UserService {
    User createUser(User user);

    User getUser(Long userId);

    User updateUser(Long userId, User userDetails);

    void deleteUser(Long userId);

    List<User> getAllUsers();
}
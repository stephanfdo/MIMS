package com.nsbm.mims.service.impl;

import com.nsbm.mims.model.User;
import com.nsbm.mims.repository.UserRepository;
import com.nsbm.mims.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    //create user
    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    //view user selected user details
    @Override
    public User getUser(Long userId) {
        return userRepository.findById(userId).orElse(null);
    }

    //update user details
    @Override
    public User updateUser(Long userId, User userDetails) {
        User user = getUser(userId);
        if (user == null)
            return null;

        user.setUsername(userDetails.getUsername());
        user.setPassword(userDetails.getPassword());
        user.setRole(userDetails.getRole());

        return userRepository.save(user);
    }

    //remove user service
    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }

//view all the user details service
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

}
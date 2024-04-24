package com.Avengers.FirstTask.Service.impl;


import com.Avengers.FirstTask.Entity.User;
import com.Avengers.FirstTask.Repository.UserRepository;
import com.Avengers.FirstTask.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserByID(Integer id) {
        return userRepository.findById(id).get();
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public String deleteUser(Integer id) {
        userRepository.deleteById(id);
        return "User Deleted!";
    }
}

package com.Avengers.FirstTask.Service;

import com.Avengers.FirstTask.Entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User create(User user);


    List<User> getAllUsers();

    User getUserByID(Integer id);

    User updateUser(User user);

    String deleteUser(Integer id);
}


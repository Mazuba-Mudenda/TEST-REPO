package com.Avengers.FirstTask.Controller;

import com.Avengers.FirstTask.Entity.User;
import com.Avengers.FirstTask.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class userControl {

    @Autowired
    UserService userService;

    //Get all users
    //localhost:8080/users
    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getAllUsers();
    }


    @GetMapping("/user/{id}")
    public User getUserByID(@PathVariable Integer id){
        return userService.getUserByID(id);
    }

    //Create a new user
    // localhost:8080/api/user/add
    @PostMapping("/user/add")
    public User createUser(@RequestBody User user){
        return userService.create(user);
    }

    //Update user by id
    //localhost:8080/api/user/{id}
    @PutMapping("/user/update/{id}")
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @DeleteMapping("/user/delete/{id}")
    public String deleteUser(@PathVariable Integer id){
        return userService.deleteUser(id);
    }
}

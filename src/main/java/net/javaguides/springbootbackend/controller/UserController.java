package net.javaguides.springbootbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springbootbackend.model.User;
import net.javaguides.springbootbackend.repository.UserRepository;

@RestController
@RequestMapping ("api/")
public class UserController {

    @Autowired
    private UserRepository userRepository; 

    @GetMapping("users")
    public List<User> getUsers(){
        return this.userRepository.findAll();
    } 
}

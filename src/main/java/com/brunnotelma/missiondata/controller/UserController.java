package com.brunnotelma.missiondata.controller;

import com.brunnotelma.missiondata.model.SystemUser;
import com.brunnotelma.missiondata.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public Iterable<SystemUser> findAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SystemUser> findUserById(@PathVariable(value = "id") long id) {
        Optional<SystemUser> user = userRepository.findById(id);

        if(user.isPresent()) {
            return ResponseEntity.ok().body(user.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/signup")
    public SystemUser saveUser(@Validated @RequestBody SystemUser user) {
        // Encodes the password before saving
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        return userRepository.save(user);
    }
}
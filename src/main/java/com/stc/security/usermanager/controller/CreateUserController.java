package com.stc.security.usermanager.controller;

import com.stc.security.model.User;
import com.stc.security.usermanager.dto.UserDTO;
import com.stc.security.usermanager.service.CreateUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: job
 * Date: 20/04/22
 * Time: 17:19
 *
 * @author job
 */
@RestController
public class CreateUserController {

    private final CreateUserService  userService;

    @Autowired
    public CreateUserController(CreateUserService  service){
        this.userService = service;
    }

    @PostMapping("/user/save")
    public ResponseEntity<Object> savedUser(@RequestBody UserDTO user){
        return ResponseEntity.ok(this.userService.create(user));
    }
}

package com.stc.security.usermanager.service;

import com.stc.security.model.User;
import com.stc.security.repository.UserRepository;
import com.stc.security.usermanager.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User: job
 * Date: 9/05/22
 * Time: 21:48
 *
 * @author job
 */
@Service
public class CreateUserService {

    private final UserRepository userRepository;
    private UserDTO userDTO;

    @Autowired
    public CreateUserService(UserRepository repo){
        this.userRepository = repo;
    }

    public boolean create(UserDTO user){
        this.userDTO = user;
        boolean saved = false;
        User userSave = parseUserDto();
        if (userSave.validUser()) {
            this.userRepository.save(userSave);
            saved = true;
        }
        return saved;
    }
    private User parseUserDto(){
        User newUser = new User();
        newUser.setAlias(userDTO.getAlias());
        newUser.setLastname(userDTO.getLastname());
        newUser.setName(userDTO.getName());
        newUser.setPassword(userDTO.getPassword());
        newUser.setRolid(userDTO.getRolid());
        return newUser;
    }
}

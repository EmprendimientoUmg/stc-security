package com.stc.security.service;

import com.stc.security.model.User;
import com.stc.security.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User: job
 * Date: 16/04/22
 * Time: 15:29
 *
 * @author job
 */
@Slf4j
public class FindAllUserService  implements UserService{
    private final UserRepository repo;

    public FindAllUserService(UserRepository userRepository){
        this.repo = userRepository;
        execute();
    }
    public void execute(){
        List<User>   users = repo.findAll();
        if (!users.isEmpty())
            log.info("Un usuairo encontrado "+users.get(0).getName());
        else
            log.info("no se encontro ningun usuario");

        User  user1 = users.get(0);
        if (user1.validUser()){
            repo.save(user1);
        }
    }

}

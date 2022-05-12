package com.stc.security.rolmanager.service;

import com.stc.security.model.Rol;
import com.stc.security.repository.RolRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User: job
 * Date: 9/05/22
 * Time: 21:14
 *
 * @author job
 */
@Service
@Slf4j
public class RolService {

    private final RolRepository repository;
    @Autowired
    public RolService(RolRepository rolRepository){
        this.repository = rolRepository;
    }

    public List<Rol> findAllRols(){
        List<Rol>  lsRoles = this.repository.findAll();
        if (!lsRoles.isEmpty()){
            log.info(" total "+lsRoles.size());
        }
        return lsRoles;
    }
}

package com.stc.security.rolmanager.controller;

import com.stc.security.rolmanager.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: job
 * Date: 9/05/22
 * Time: 21:18
 *
 * @author job
 */
@RestController
public class Rolcontroller {

    private final RolService service;

    @Autowired
    public Rolcontroller(RolService service){
        this.service = service;
    }
    @GetMapping("/find-allrol")
    public ResponseEntity<Object> getRols(){
        return ResponseEntity.ok(this.service.findAllRols());
    }

}

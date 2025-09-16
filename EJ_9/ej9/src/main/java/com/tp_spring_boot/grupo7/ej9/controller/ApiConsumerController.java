package com.tp_spring_boot.grupo7.ej9.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.tp_spring_boot.grupo7.ej9.model.ApiConsumerService;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class ApiConsumerController {

    @Autowired
    private ApiConsumerService apiConsumerService;

    @GetMapping("/personajes")
    public String getPersonajes() {
        return apiConsumerService.obtenerPersonajes();
    }
    

}

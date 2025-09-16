package com.tp_spring_boot.grupo7.ej9.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiConsumerService {
    
    @Autowired
    private RestTemplate restTemplate;
    
    public String obtenerPersonajes(){
        String personajes = restTemplate.getForObject("https://rickandmortyapi.com/api/character", String.class);
        return personajes;
    }

}

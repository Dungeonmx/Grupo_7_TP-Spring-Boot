package com.tp_spring_boot.grupo7.ej4.controller;

import org.springframework.web.bind.annotation.RestController;

import com.tp_spring_boot.grupo7.ej4.model.Estadistico;
import com.tp_spring_boot.grupo7.ej4.model.EstadisticasResponse;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class EstadisticasController {

    @PostMapping("/estadisticas")
    public EstadisticasResponse calcularEstadisticas(@RequestBody Estadistico estadistico) {
        return estadistico.clacularEstadisticas();
    }
    
    
}

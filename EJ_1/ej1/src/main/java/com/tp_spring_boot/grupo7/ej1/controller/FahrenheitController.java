package com.tp_spring_boot.grupo7.ej1.controller;


import org.springframework.web.bind.annotation.RestController;

import com.tp_spring_boot.grupo7.ej1.model.ConverterCelsius2Fahrenheit;
import com.tp_spring_boot.grupo7.ej1.model.CelsiusConverted2Fahrenheit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class FahrenheitController {

    ConverterCelsius2Fahrenheit converter;

    public FahrenheitController(ConverterCelsius2Fahrenheit converter){
        this.converter = converter;
    }

    @GetMapping("/celsiusAfahrenheit/{celsius}")
    public  CelsiusConverted2Fahrenheit convert(@PathVariable double celsius) {
        return converter.convert(celsius);
    }
}

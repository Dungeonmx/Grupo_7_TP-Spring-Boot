package com.tp_spring_boot.grupo7.ej1.model;

import org.springframework.stereotype.Service;

@Service
public class ConverterCelsius2Fahrenheit {

    public CelsiusConverted2Fahrenheit convert(double celsius){
        return new CelsiusConverted2Fahrenheit(celsius, celsius * 1.8 + 32);
    }

}

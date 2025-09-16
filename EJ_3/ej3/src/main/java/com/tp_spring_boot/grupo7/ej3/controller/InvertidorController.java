package com.tp_spring_boot.grupo7.ej3.controller;

import org.springframework.web.bind.annotation.RestController;

import com.tp_spring_boot.grupo7.ej3.model.InputReversed;
import com.tp_spring_boot.grupo7.ej3.model.ReverseInput;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class InvertidorController {

    @GetMapping("/invertir/{input}")
    public InputReversed invertir(@PathVariable String input) {
        return ReverseInput.reverse(input);
    }
    

}

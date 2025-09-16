package com.tp_spring_boot.grupo7.ej3.model;

import org.springframework.stereotype.Service;

@Service
public class ReverseInput {
    public static InputReversed reverse(String input){
        String invertido = "";
        char[] inputArray = input.toCharArray();
        for (int i = inputArray.length - 1; i >= 0; i--){
            invertido += inputArray[i];
        }
        return new InputReversed(input, invertido);
    }
}

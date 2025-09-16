package com.tp_spring_boot.grupo7.ej4.model;

import org.springframework.stereotype.Service;

@Service
public class Estadistico {
    private int[] numeros;
    
    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }

    public EstadisticasResponse clacularEstadisticas(){
        return new EstadisticasResponse(this.promedio(), this.min(), this.max(), this.numeros.length);
    }

    private float promedio(){
        float promedio = 0;

        for(int i : this.numeros){
            promedio += i;
        }

        promedio /= numeros.length;

        return promedio;
    }

    private int min(){
        int min = this.numeros[0];

        for(int i: this.numeros){
            if (min > i){min = i;} 
        }

        return min;
    }

    private int max(){
        int max = this.numeros[0];

        for(int i : this.numeros){
            if (max < i){max = i;}
        }

        return max;
    }
}

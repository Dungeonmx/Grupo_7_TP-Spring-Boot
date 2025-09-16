package com.tp_spring_boot.grupo7.ej5.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tp_spring_boot.grupo7.ej5.model.Libro;

@Repository
public class LibroRepository {
    
    private List<Libro> libros = new ArrayList<Libro>();

    public List<Libro> encontrarTodo(){
        return libros;
    }

    public void guardar(Libro libro){
        libros.add(libro);
    }

    public Libro encontrarPorId(long id){
        int i = 0;
        int index = 0;

        boolean encontrado = false;

        while (i < libros.size() && !encontrado){
            if(libros.get(i).id() == id){
                index = i;
                encontrado = true;
            }
            i++;
        }

        return (encontrado)? libros.get(index) : (new Libro(0, "null", "null", "null"));
    }

    public void eliminarPorId(long id){
        int i = 0;
        int index = 0;

        boolean encontrado = false;

        while (i < libros.size() && !encontrado){
            if(libros.get(i).id() == id){
                index = i;
                encontrado = true;
            }
            i++;
        }

        if (encontrado){
            libros.remove(index);
        }
    }
}

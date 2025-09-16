package com.tp_spring_boot.grupo7.ej5.model;

import java.util.List;
import org.springframework.stereotype.Service;
import com.tp_spring_boot.grupo7.ej5.repository.LibroRepository;

@Service
public class LibroService {

    private LibroRepository libroRepository;

    public LibroService(LibroRepository libroRepository){
        this.libroRepository = libroRepository;
    }

    public List<Libro> listarTodo(){
        return libroRepository.encontrarTodo();
    }

    public void agregar(Libro libro){
        libroRepository.guardar(libro);
    }

    public Libro buscarPorId(long id){
        return libroRepository.encontrarPorId(id);
    }

    public void eliminar(long id){
       libroRepository.eliminarPorId(id);
    }

}

package com.tp_spring_boot.grupo7.ej5.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tp_spring_boot.grupo7.ej5.model.Libro;
import com.tp_spring_boot.grupo7.ej5.model.LibroService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/libros")
public class LibrosController {

    private LibroService libroService;

    public LibrosController(LibroService libroService){
        this.libroService = libroService;
    }

    @GetMapping("/")
    public List<Libro> listarTodo() {
        return libroService.listarTodo();
    }
    
    @PostMapping("/")
    public void agregar(@RequestBody Libro libro) {
        libroService.agregar(libro);
    }

    @GetMapping("/{id}")
    public Libro buscarPorId(@PathVariable long id) {
        return libroService.buscarPorId(id);
    }
    
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable long id){
        libroService.eliminar(id);
    }
}

package ar.edu.unlpam.tp.SpringBootEj7.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ar.edu.unlpam.tp.SpringBootEj7.model.Pelicula;
import ar.edu.unlpam.tp.SpringBootEj7.service.PeliculaService;

@RestController
public class PeliculaController {
  private final PeliculaService peliculaService;

  public PeliculaController(PeliculaService peliculaService) {
    this.peliculaService = peliculaService;
  }

  @GetMapping("/peliculas")
  public List<Pelicula> listarTodas() {
    return peliculaService.listarTodas();
  }

  @GetMapping("peliculas/buscar")
  public Optional<Pelicula> buscar(@RequestParam(name = "titulo") String titulo) {
    return peliculaService.buscar(titulo);
  }

  @PostMapping("/peliculas")
  public Pelicula agregar(@RequestBody Pelicula pelicula) {
    return peliculaService.agregar(pelicula);
  }

  @DeleteMapping("/peliculas/{id}")
  public boolean eliminar(@PathVariable Long id) {
    return peliculaService.eliminar(id);
  }
}
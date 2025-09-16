package ar.edu.unlpam.tp.SpringBootEj7.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;
import ar.edu.unlpam.tp.SpringBootEj7.model.Pelicula;

@Repository
public class PeliculaRepository {
  private List<Pelicula> peliculas = new ArrayList<>();

  public List<Pelicula> encontrarTodas() {
    return new ArrayList<>(peliculas);
  }

  public Optional<Pelicula> buscarPorTitulo(String titulo) {
    return peliculas.stream().filter(p -> p.getTitulo().equals(titulo)).findFirst();
  }

  public Pelicula guardar(Pelicula pelicula) {
    peliculas.add(pelicula);
    return pelicula;
  }

  public boolean eliminarPorId(Long id) {
    return peliculas.removeIf(p -> p.getId().equals(id));
  }
}

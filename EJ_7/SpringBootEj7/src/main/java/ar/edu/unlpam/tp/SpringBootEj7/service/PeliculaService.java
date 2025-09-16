package ar.edu.unlpam.tp.SpringBootEj7.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import ar.edu.unlpam.tp.SpringBootEj7.model.Pelicula;
import ar.edu.unlpam.tp.SpringBootEj7.repository.PeliculaRepository;

@Service
public class PeliculaService {
  private final PeliculaRepository peliculaRepository;

  public PeliculaService(PeliculaRepository peliculaRepository) {
    this.peliculaRepository = peliculaRepository;
  }

  public List<Pelicula> listarTodas() {
    return peliculaRepository.encontrarTodas();
  }

  public Optional<Pelicula> buscar(String titulo) {
    return peliculaRepository.buscarPorTitulo(titulo);
  }

  public Pelicula agregar(Pelicula pelicula) {
    return peliculaRepository.guardar(pelicula);
  }

  public boolean eliminar(Long id) {
    return peliculaRepository.eliminarPorId(id);
  }
}

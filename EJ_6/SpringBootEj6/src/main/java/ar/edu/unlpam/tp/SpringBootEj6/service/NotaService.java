package ar.edu.unlpam.tp.SpringBootEj6.service;

import java.util.List;
import org.springframework.stereotype.Service;
import ar.edu.unlpam.tp.SpringBootEj6.model.Nota;
import ar.edu.unlpam.tp.SpringBootEj6.repository.NotaRepository;

@Service
public class NotaService {
  private final NotaRepository notaRepository;

  public NotaService(NotaRepository notaRepository) {
    this.notaRepository = notaRepository;
  }

  public List<Nota> listarTodas() {
    return notaRepository.encontrarTodas();
  }

  public Nota crear(Nota nota) {
    return notaRepository.guardar(nota);
  }

  public Nota actualizar(Long id, String nuevoTitulo, String nuevoContenido) {
    return notaRepository.actualizar(id, nuevoTitulo, nuevoContenido);
  }

  public boolean eliminar(Long id) {
    return notaRepository.eliminar(id);
  }
}

package ar.edu.unlpam.tp.SpringBootEj6.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import ar.edu.unlpam.tp.SpringBootEj6.model.Nota;

@Repository
public class NotaRepository {
  private Long siguienteId = 1L;
  private List<Nota> notas = new ArrayList<>();

  public List<Nota> encontrarTodas() {
    return new ArrayList<>(notas);
  }

  public Nota guardar(Nota nota) {
    nota.setId(siguienteId++);
    notas.add(nota);
    return nota;
  }

  public Nota actualizar(Long id, String nuevoTitulo, String nuevoContenido) {
    for (Nota n : notas) {
      if (n.getId().equals(id)) {
        if (nuevoTitulo != null)
          n.setTitulo(nuevoTitulo);
        if (nuevoContenido != null)
          n.setContenido(nuevoContenido);
        return n;
      }
    }
    return null;
  }

  public boolean eliminar(Long id) {
    return notas.removeIf(n -> n.getId().equals(id));
  }
}

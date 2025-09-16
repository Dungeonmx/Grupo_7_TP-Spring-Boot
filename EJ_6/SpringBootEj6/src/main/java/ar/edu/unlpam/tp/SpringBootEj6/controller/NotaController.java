package ar.edu.unlpam.tp.SpringBootEj6.controller;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ar.edu.unlpam.tp.SpringBootEj6.model.Nota;
import ar.edu.unlpam.tp.SpringBootEj6.service.NotaService;

@RestController
public class NotaController {
  private final NotaService notaService;

  public NotaController(NotaService notaService) {
    this.notaService = notaService;
  }

  @GetMapping("/notas")
  public List<Nota> listarTodas() {
    return notaService.listarTodas();
  }

  @PostMapping("/notas")
  public Nota crear(@RequestBody Nota nota) {
    return notaService.crear(nota);
  }

  @PutMapping("/notas/{id}")
  public Nota actualizar(@PathVariable Long id, @RequestBody Nota datos) {
    return notaService.actualizar(id, datos.getTitulo(), datos.getContenido());
  }

  @DeleteMapping("/notas/{id}")
  public boolean eliminar(@PathVariable Long id) {
    return notaService.eliminar(id);
  }
}

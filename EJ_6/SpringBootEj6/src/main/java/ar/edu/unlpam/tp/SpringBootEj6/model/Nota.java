package ar.edu.unlpam.tp.SpringBootEj6.model;

import java.time.LocalDate;

public class Nota {
  private Long id;
  private String titulo;
  private String contenido;
  private LocalDate fechaCreacion;

  public Nota(String titulo, String contenido) {
    this.titulo = titulo;
    this.contenido = contenido;
    this.fechaCreacion = LocalDate.now();
  }

  public Long getId() {
    return id;
  }

  public String getTitulo() {
    return titulo;
  }

  public String getContenido() {
    return contenido;
  }

  public LocalDate getFechaCreacion() {
    return fechaCreacion;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public void setContenido(String contenido) {
    this.contenido = contenido;
  }
}

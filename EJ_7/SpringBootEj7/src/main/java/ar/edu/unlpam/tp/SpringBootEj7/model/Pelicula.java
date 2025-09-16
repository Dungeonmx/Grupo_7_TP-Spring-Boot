package ar.edu.unlpam.tp.SpringBootEj7.model;

public class Pelicula {
  private Long id;
  private String titulo;
  private String director;
  private int anio;
  private String genero;

  public Pelicula(Long id, String titulo, String director, int anio, String genero) {
    this.id = id;
    this.titulo = titulo;
    this.director = director;
    this.anio = anio;
    this.genero = genero;
  }

  public Long getId() {
    return id;
  }

  public String getTitulo() {
    return titulo;
  }

  public String getDirector() {
    return director;
  }

  public int getAnio() {
    return anio;
  }

  public String getGenero() {
    return genero;
  }
}

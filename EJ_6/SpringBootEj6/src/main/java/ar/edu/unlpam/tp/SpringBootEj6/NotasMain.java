package ar.edu.unlpam.tp.SpringBootEj6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NotasMain {
	public static void main(String[] args) {
		SpringApplication.run(NotasMain.class, args);
	}
}

/*
 * Cuando vos ponés en el main:
 * SpringApplication.run arranca el contenedor de Spring.
 * Ese contenedor es el que:
 * - Crea objetos de las clases anotadas con @Service, @RestController, etc.
 * - Los mantiene en memoria como beans singleton.
 * - Y se encarga de inyectarlos automáticamente en donde se necesiten (por
 * constructor, por atributo, etc.).
 * Es decir, vos nunca instanciás el NotaController manualmente, Spring lo hace
 * por vos y le mete dentro el NotaService si es que fuera por inyección de
 * dependencia.
 */
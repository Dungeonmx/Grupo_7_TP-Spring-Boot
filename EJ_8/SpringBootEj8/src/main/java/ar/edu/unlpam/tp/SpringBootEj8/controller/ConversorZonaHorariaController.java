package ar.edu.unlpam.tp.SpringBootEj8.controller;

import java.util.HashMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import ar.edu.unlpam.tp.SpringBootEj8.model.ConversorZonaHoraria;

@RestController
public class ConversorZonaHorariaController {
  ObjectMapper mapperObj = new ObjectMapper();

  @GetMapping("/hora")
  public String hora(
      @RequestParam String fecha,
      @RequestParam String origen,
      @RequestParam String destino) throws JsonProcessingException {
    ConversorZonaHoraria conversor = new ConversorZonaHoraria();

    HashMap<String, Object> response = new HashMap<>();
    response.put("origen", fecha);
    response.put("destino", conversor.getFechaDestino(fecha, origen, destino));

    return mapperObj.writeValueAsString(response);
  }
}

package ar.edu.unlpam.tp.SpringBootEj2.controller;

import java.util.HashMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import ar.edu.unlpam.tp.SpringBootEj2.model.PrimoChecker;

@RestController
public class PrimoCheckerController {
  private ObjectMapper mapperObj = new ObjectMapper();

  @GetMapping("/esPrimo/{numero}")
  public String esPrimo(@PathVariable int numero) throws JsonProcessingException {
    PrimoChecker primoChecker = new PrimoChecker();
    HashMap<String, Object> response = new HashMap<>();
    response.put("numero", numero);
    response.put("esPrimo", primoChecker.esPrimo(numero));
    return mapperObj.writeValueAsString(response);
  }
}

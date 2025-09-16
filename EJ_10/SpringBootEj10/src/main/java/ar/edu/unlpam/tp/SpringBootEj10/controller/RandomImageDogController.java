package ar.edu.unlpam.tp.SpringBootEj10.controller;

import java.util.HashMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import ar.edu.unlpam.tp.SpringBootEj10.service.RandomImageDogService;

@RestController
public class RandomImageDogController {
  private ObjectMapper mapperObj = new ObjectMapper();
  private final RandomImageDogService service;

  public RandomImageDogController(RandomImageDogService service) {
    this.service = service;
  }

  @GetMapping("/randomImageDog")
  public String randomImageDog() throws JsonProcessingException {
    HashMap<String, String> response = service.getImage();
    return mapperObj.writeValueAsString(response);
  }
}

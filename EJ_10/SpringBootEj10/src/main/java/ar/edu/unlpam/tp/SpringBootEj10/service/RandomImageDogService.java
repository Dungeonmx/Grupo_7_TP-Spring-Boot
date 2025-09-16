package ar.edu.unlpam.tp.SpringBootEj10.service;

import java.util.HashMap;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ar.edu.unlpam.tp.SpringBootEj10.model.RandomImageDog;

@Service
public class RandomImageDogService {
  private final RestTemplate restTemplate;

  public RandomImageDogService(RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }

  public HashMap<String, String> getImage() {
    String api = "https://dog.ceo/api/breeds/image/random";
    RandomImageDog image = restTemplate.getForObject(api, RandomImageDog.class);
    HashMap<String, String> response = new HashMap<>();
    response.put("message", image.getMessage());
    response.put("status", image.getStatus());
    return response;
  }
}

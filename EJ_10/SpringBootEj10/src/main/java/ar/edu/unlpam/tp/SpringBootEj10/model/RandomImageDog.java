package ar.edu.unlpam.tp.SpringBootEj10.model;

public class RandomImageDog {
  private String message;
  private String status;

  public RandomImageDog(String message, String status) {
    this.message = message;
    this.status = status;
  }

  public String getMessage() {
    return message;
  }

  public String getStatus() {
    return status;
  }
}

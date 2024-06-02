package model;

public class CarDTO {

  private String name;
  private int distance;

  public CarDTO(String name) {
    this.name = name;
    this.distance = 0;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getDistance() {
    return distance;
  }

  public void setDistance(int distance) {
    this.distance = distance;
  }

  @Override
  public String toString() {
    return name + " : " + "-".repeat(distance);
  }
}
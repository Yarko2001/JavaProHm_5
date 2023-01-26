package dehtiar.hillel.homework_5.part_1.models;

import dehtiar.hillel.homework_5.part_1.api.Figure;

/**
 * @author Yaroslav Dehtiar on 27.01.2023
 */
public class Circle implements Figure {

  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double calculateSquare() {
    return Math.PI * Math.pow(radius, 2);
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }
}

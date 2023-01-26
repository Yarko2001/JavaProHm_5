package dehtiar.hillel.homework_5.part_1.models;

import dehtiar.hillel.homework_5.part_1.api.Figure;

/**
 * @author Yaroslav Dehtiar on 27.01.2023
 */
public class Triangle implements Figure {

  private double sideOne;
  private double sideTwo;
  private double sideThree;

  public Triangle(double sideOne, double sideTwo, double sideThree) {
    this.sideOne = sideOne;
    this.sideTwo = sideTwo;
    this.sideThree = sideThree;
  }

  @Override
  public double calculateSquare() {
    double sum = (sideOne + sideTwo + sideThree) / 2.0;
    return Math.sqrt(sum * (sum - sideOne) * (sum - sideTwo) * (sum - sideThree));
  }

  public double getSideOne() {
    return sideOne;
  }

  public void setSideOne(double sideOne) {
    this.sideOne = sideOne;
  }

  public double getSideTwo() {
    return sideTwo;
  }

  public void setSideTwo(double sideTwo) {
    this.sideTwo = sideTwo;
  }

  public double getSideThree() {
    return sideThree;
  }

  public void setSideThree(double sideThree) {
    this.sideThree = sideThree;
  }

}

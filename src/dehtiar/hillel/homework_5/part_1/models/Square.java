package dehtiar.hillel.homework_5.part_1.models;

import dehtiar.hillel.homework_5.part_1.api.Figure;

/**
 * @author Yaroslav Dehtiar on 27.01.2023
 */
public class Square implements Figure {

  private double border;

  public Square(double border) {
    this.border = border;
  }

  @Override
  public double calculateSquare() {
    return Math.pow(border, 2);
  }

  public double getBorder() {
    return border;
  }

  public void setBorder(double border) {
    this.border = border;
  }
}

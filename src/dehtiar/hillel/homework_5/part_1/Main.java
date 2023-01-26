package dehtiar.hillel.homework_5.part_1;

import dehtiar.hillel.homework_5.part_1.api.Figure;
import dehtiar.hillel.homework_5.part_1.models.Circle;
import dehtiar.hillel.homework_5.part_1.models.Square;
import dehtiar.hillel.homework_5.part_1.models.Triangle;

/**
 * @author Yaroslav Dehtiar on 27.01.2023
 */
public class Main {

  public static void main(String[] args) {
    Figure[] array = {new Circle(5), new Triangle(4, 4, 4), new Square(3)};
    System.out.println("Square of circle :" + array[0].calculateSquare());
    System.out.println("Square of triangle :" + array[1].calculateSquare());
    System.out.println("Square of Square :" + array[2].calculateSquare());
    calculateAmountOfFigures(array);
  }

  private static void calculateAmountOfFigures(Figure[] array) {
    int total = 0;
    for (Figure figure : array) {
      total += figure.calculateSquare();
    }
    System.out.println("Total of the figures :" + total);
  }
}

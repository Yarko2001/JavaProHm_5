package dehtiar.hillel.homework_5.part_2.participants;

/**
 * @author Yaroslav Dehtiar on 27.01.2023
 */
public abstract class Participant {

  private final String name;
  private final double topJumpHeight;
  private final double topRunDistance;

  private final String thisClassName = this.getClass().getSimpleName();

  public Participant(String name, double topJumpHeight, double topRunDistance) {
    this.name = name;
    this.topJumpHeight = topJumpHeight;
    this.topRunDistance = topRunDistance;
  }

  public String jump() {
    return " is jumping ";
  }

  public String run() {
    return " is running";
  }

  public String getName() {
    return name;
  }

  public double getTheBestJumpHeight() {
    return topJumpHeight;
  }

  public double getTheBestRunDistance() {
    return topRunDistance;
  }
}

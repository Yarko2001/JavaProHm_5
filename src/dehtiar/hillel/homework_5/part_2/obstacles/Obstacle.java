package dehtiar.hillel.homework_5.part_2.obstacles;

import dehtiar.hillel.homework_5.part_2.participants.Participant;

/**
 * @author Yaroslav Dehtiar on 27.01.2023
 */
public abstract class Obstacle {

  private final String name;
  private final String thisClassName = this.getClass().getSimpleName();

  public Obstacle(String name) {
    this.name = name;
  }

  public abstract boolean overcome(Participant participant);

  public abstract String overcoming(Participant participant);

  public abstract String getDistance();

  public String getName() {
    return name + " " + thisClassName;
  }

  public String getThisClassName() {
    return thisClassName;
  }
}

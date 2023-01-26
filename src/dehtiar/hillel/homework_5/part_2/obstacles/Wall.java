package dehtiar.hillel.homework_5.part_2.obstacles;

import dehtiar.hillel.homework_5.part_2.participants.Participant;

/**
 * @author Yaroslav Dehtiar on 27.01.2023
 */
public class Wall extends Obstacle {

  private double heightOfTheWall;

  public Wall(String name, double heightOfTheWall) {
    super(name);
    this.heightOfTheWall = heightOfTheWall;
  }

  @Override
  public boolean overcome(Participant participant) {
    return participant.getTheBestJumpHeight() > heightOfTheWall;
  }

  @Override
  public String overcoming(Participant participant) {
    String str = participant.jump() + " and ";
    if (overcome(participant)) {
      str += "| overcame |";
    } else {
      str += "| didn't overcome |";
    }
    return str;
  }

  @Override
  public String getDistance() {
    return " at height [" + heightOfTheWall + "] m.";
  }
}

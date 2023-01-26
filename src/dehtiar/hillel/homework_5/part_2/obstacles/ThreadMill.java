package dehtiar.hillel.homework_5.part_2.obstacles;

import dehtiar.hillel.homework_5.part_2.participants.Participant;

/**
 * @author Yaroslav Dehtiar on 27.01.2023
 */
public class ThreadMill extends Obstacle {

  private final int distanceOfThreadMill;

  public ThreadMill(String name, int distanceOfRunning) {
    super(name);
    this.distanceOfThreadMill = distanceOfRunning;
  }

  @Override
  public boolean overcome(Participant participant) {
    return participant.getTheBestRunDistance() > distanceOfThreadMill;
  }

  @Override
  public String overcoming(Participant participant) {
    String str = participant.run() + " and ";
    if (overcome(participant)) {
      str += "| overcame |";
    } else {
      str += "| didn't overcome |";
    }
    return str;

  }

  @Override
  public String getDistance() {
    return " at distance [" + distanceOfThreadMill + "] m.";
  }
}

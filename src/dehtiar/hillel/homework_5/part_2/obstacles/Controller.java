package dehtiar.hillel.homework_5.part_2.obstacles;

import dehtiar.hillel.homework_5.part_2.participants.Participant;

/**
 * @author Yaroslav Dehtiar on 27.01.2023
 */
public class Controller {

  private final String teamName;
  private final Participant[] participants;
  private final Obstacle[] obstacles;

  public Controller(String teamName, Participant[] participants, Obstacle[] obstacles) {
    this.teamName = teamName;
    this.participants = participants;
    this.obstacles = obstacles;
  }

  public void race() {

    String lastOvercoming = "";
    System.out.println(teamName + " is starting right now !");

    for (Participant participant : participants) {
      System.out.println(participant.getName() + " is gonna start...");

      for (Obstacle obstacle : obstacles) {

        System.out.println(viewParticipantResult(participant, obstacle));
        if (!obstacle.overcome(participant)) {
          System.out.println("Drop out the competition ( " + lastOvercoming);
          break;
        }
        lastOvercoming = "Last " + viewParticipantResult(participant, obstacle);

      }

    }
    System.out.println(teamName + " have finished their competition.");

  }

  private static String viewParticipantResult(Participant participant, Obstacle obstacle) {

    return participant.getName() + obstacle.overcoming(participant) + " the "
        + obstacle.getName() + obstacle.getDistance();

  }


}

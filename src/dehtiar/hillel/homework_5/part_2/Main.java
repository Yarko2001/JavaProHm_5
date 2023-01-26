package dehtiar.hillel.homework_5.part_2;

import dehtiar.hillel.homework_5.part_2.obstacles.Controller;
import dehtiar.hillel.homework_5.part_2.obstacles.Obstacle;
import dehtiar.hillel.homework_5.part_2.obstacles.ThreadMill;
import dehtiar.hillel.homework_5.part_2.obstacles.Wall;
import dehtiar.hillel.homework_5.part_2.participants.Cat;
import dehtiar.hillel.homework_5.part_2.participants.Human;
import dehtiar.hillel.homework_5.part_2.participants.Participant;
import dehtiar.hillel.homework_5.part_2.participants.Robot;

/**
 * @author Yaroslav Dehtiar on 27.01.2023
 */
public class Main {

  public static void main(String[] args) {

    Participant participant1 = new Human("Genri", 1.1, 50);
    Participant participant2 = new Robot("RoboCop", 0.5, 1200);
    Participant participant3 = new Cat("Willy", 2.5, 500);

    Participant[] participants = {participant1, participant2, participant3};

    Obstacle obst1 = new ThreadMill("first", 200);
    Obstacle obst2 = new Wall("iron", 0.9);
    Obstacle obst3 = new Wall("wood", 1.5);
    Obstacle obst4 = new ThreadMill("second", 550);
    Obstacle obst5 = new Wall("gold", 2.3);
    Obstacle obst6 = new ThreadMill("third", 1000);

    Obstacle[] obstacles = {obst1, obst2, obst3, obst4, obst5, obst6};

    Controller viewRace = new Controller("Crazy Horses", participants, obstacles);
    viewRace.race();
  }
}

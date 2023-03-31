package src.before;

import src.refactor.Sungard;

public class RobotMain {
    public static void main(String[] args) {
        Robot[] robots = new Robot[3];
        robots[0] = new TaekwonV("TaekwonV");
        robots[1] = new Atom("Atom");
        robots[2] = new Atom("Atom2");

        for (Robot robot : robots) {
            System.out.println(robot.getName());
            robot.attack();
            robot.move();
        }
    }
}
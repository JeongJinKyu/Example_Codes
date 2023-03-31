package src.refactor;


public class RobotMain {
    public static void main(String[] args) {
        Robot[] robots = new Robot[3];
        robots[0] = new TaekwonV("TaekwonV");
        robots[1] = new Atom("Atom");
        robots[2] = new Sungard("Sungard");


        for (Robot robot : robots) {
            System.out.println(robot.getName());
            robot.attack();
            robot.move();
        }

        System.out.println("after change fly to move");
        robots[2].setMove(new walk());
        robots[2].attack();
        robots[2].move();
    }
}
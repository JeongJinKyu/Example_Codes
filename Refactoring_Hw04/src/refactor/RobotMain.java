package src.refactor;


public class RobotMain {
    public static void main(String[] args) {
        Robot[] robots = new Robot[3];


//		싱글톤 패턴을 이용하여 메모리 낭비 방지

		PunchAttack punch_attack = PunchAttack.getinstance();
        MissileAttack rocket_attack = MissileAttack.getinstance();
        fly fly_ = fly.getinstance();
        walk walk_ = walk.getinstance();


/*		strategy pattern 에서 context는 concrete strategy를 "몰라야" 함
		즉, 의존성을 가지면 안됨*/

        robots[0] = new TaekwonV("TaekwonV", rocket_attack, walk_);
        robots[1] = new Atom("Atom", punch_attack, fly_);
        robots[2] = new Sungard("Sungard", punch_attack, fly_);


        for (Robot robot : robots) {
            System.out.println(robot.getName());
            robot.attack();
            robot.move();
        }

        System.out.println("after change fly to move");
		/*
		같은 클래스에 대하여 반복적으로 publice 하게되어있는 new 생성자를 이용하면
		이전에 생성된 객체는 garbage 객체가 되어 메모리 낭비가 되므로
		
		생성자를 private하게 설정 하여 마음대로 객체 생성을 못하도록 방지 후
		싱긆톤 패턴을 이용하여 getinstance()로만 객체를 가져올 수 있게끔 함 
		*/
        robots[2].setMove(walk_);
		robots[2].setAttack(punch_attack);
        robots[2].attack();
        robots[2].move();
    }
}
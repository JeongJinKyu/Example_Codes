package src.refactor;

public abstract class Robot {
	private String name;
	private attack attack;
	private move move;

	public Robot(String name, attack attack, move move) {
		this.name = name;
		this.attack = attack;
		this.move = move;
	}

	public void setMove(move move) {
		this.move = move;
	}

	public void setAttack(attack attack) {
		this.attack = attack;
	}

	public String getName() {
		return name;
	}

	public void attack(){
		attack.Do_Attack();
	};

	public void move(){
		move.Get_move();
	};
}

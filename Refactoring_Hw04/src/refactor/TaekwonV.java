package src.refactor;

public class TaekwonV extends Robot {
	public TaekwonV(String name) {
		super(name,new MissileAttack(),new walk());
	}
}
package src.refactor;

public class Atom extends Robot {
	public Atom(String name) {
		super(name,new PunchAttack(),new fly() );
	}
}
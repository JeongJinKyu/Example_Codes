package src.refactor;

public class Atom extends Robot {
/**
context는 concrete strategy를 "몰라야" 함
즉, 의존성을 가지면 안됨
직접 new 생성자를 이용하면 "아는"경우가 되므로 의존성을 가지게 됨
**/
	public Atom(String name, attack attack, move move) {
		super(name,attack,move);
	}
}
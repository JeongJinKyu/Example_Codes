package src.refactor;

public class Sungard extends Robot {
    public Sungard(String name) {
        super(name,new MissileAttack(),new fly());
    }
}
package src.refactor;

public class MissileAttack implements attack{
	private static final MissileAttack instance = new MissileAttack();
	private MissileAttack(){}
	public static MissileAttack getinstance(){return instance;}
    public void Do_Attack(){
        System.out.println("I have Missile and can attack with it.");
    }
}

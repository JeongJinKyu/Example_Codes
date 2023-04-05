package src.refactor;

public class PunchAttack implements attack{
	
	/**
	전역 객체변수, static으로 만들어 한번만 생성되게
	**/
	private final static PunchAttack instance = new PunchAttack();
	/**
	생성자를 private으로 만들어 접근을 막는다
	메모리 낭비를 막기 위함이므로 접근을 막음으로써 멋대로 생성하지 못하도록 함
	strategy pattern에서 context가 concrete strategy에 대해서 의존성을 가지면 안됨
	concrete strategy를 몰라야 함
	**/
	private PunchAttack() {	}
	/**
	getinstance를 static하게 만듦으로써 객체가 한번만 생성되게끔 함, 
	여러개를 생성하지 못하게 해서 메모리 낭비 방지
	**/
	public static PunchAttack getinstance(){return instance;}

    public void Do_Attack(){
        System.out.println("I have strong punch and can attack with it.");
    }
}

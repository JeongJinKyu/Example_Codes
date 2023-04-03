package src.refactor;

public class fly implements move{

	private static Fly instance = new Fly();
	private Fly() {	}
	public static Fly getinstance(){return instance;}
    public void Get_move(){
        System.out.println("I can fly.");
    }
}

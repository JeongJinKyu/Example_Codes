package src.refactor;

public class fly implements move{

	private final static fly instance = new fly();
	private fly() {	}
	public static fly getinstance(){return instance;}
    public void Get_move(){
        System.out.println("I can fly.");
    }
}

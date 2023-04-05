package src.refactor;

public class walk implements move{
	private final static walk instance = new walk();
	private walk(){}
	public static walk getinstance(){return instance;}
    public void Get_move(){
        System.out.println("I can only walk.");
    }
}

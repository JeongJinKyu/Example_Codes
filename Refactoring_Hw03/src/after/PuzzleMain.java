package after;


public class PuzzleMain {
    public static void main(String[] args) {
    PuzzleBuilder puzzleBuilder = new PuzzleBuilder("YoumotherOfRussia_Fucker",5);
    puzzleBuilder.addWord(new Word("hello", new Position(0,0,Direction.HORIZONTAL)));
    puzzleBuilder.addWord(new Word("hello", new Position(0,2,Direction.HORIZONTAL)));
    puzzleBuilder.addWord(new Word("world", new Position(0,1,Direction.VERTICAL)));
    puzzleBuilder.addWord(new Word("java", new Position(2,2,Direction.HORIZONTAL)));
    puzzleBuilder.addWord(new Word("programming", new Position(3,3,Direction.VERTICAL)));

    System.out.print(puzzleBuilder.getFullReport(false) + " ");
    System.out.print(puzzleBuilder.getShortReport(new Report(false)) + " ");
}
}

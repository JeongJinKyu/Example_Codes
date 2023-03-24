package after;


public class PuzzleMain {
    public static void main(String[] args) {
    PuzzleBuilder puzzleBuilder = new PuzzleBuilder("YoumotherOfRussia",5);
    puzzleBuilder.addWord("hello", 0, 0, 0);
    puzzleBuilder.addWord("hello", 0, 2, 0);
    puzzleBuilder.addWord("world", 0, 1, 1);
    puzzleBuilder.addWord("java", 2, 2, 0);
    puzzleBuilder.addWord("programming", 3, 3, 1);

    System.out.print(puzzleBuilder.getFullReport(false) + " ");
    System.out.print(puzzleBuilder.getShortReport(false) + " ");
}
}

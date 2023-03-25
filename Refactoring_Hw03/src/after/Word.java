package after;

public class Word {
    private String word_name;
    private Position word_position;
    private Point point;


    public Word(String word_name, Position word_position) {
        this.word_name = word_name;
        this.word_position = word_position;
        this.point = new Point(word_name.length());
    }

    public int calculatePoint(){
        return point.getPoint(word_position.isHorzontal());
    }

    public Position getWord_positions() {
        return word_position;
    }
    public String getword() {
        return word_name;
    }

    public boolean is_equal_word(Word word_) {
        return word_name.equals(word_.getword()) && word_.getWord_positions().getDirection().equals(word_position.getDirection());
    }

    public boolean is_there_cross_word(Word word_) {
        return word_position.is_cross(word_.getWord_positions(),word_.getword().length(),word_name.length());
    }
}

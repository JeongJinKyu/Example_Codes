package after;

public class Word {
    private String word_name;
    private Position word_position;



    public Word(String word_name, Position word_positions) {
        this.word_name = word_name;
        this.word_position = word_positions;
    }
    public Position getWord_positions() {
        return word_position;
    }
    public String getword() {
        return word_name;
    }

    public boolean is_there_equal_word(Word[] words_) {
        for(Word word_: words_)
            if(word_name.compareTo(word_.getword()) == 0 && word_.getWord_positions().equals(word_position))
                return true;
        return false;
    }

    public boolean is_there_cross_word(Word[] words_) {
        for(Word word_: words_)
            if(word_.getWord_positions().is_cross(word_position,word_.getword().length()))
                return true;
        return false;
    }
}

package after;
enum Direction{VERTICAL, HORIZONTAL}
public class Position {
    private int x_coordinate_of_word;
    private int y_coordinate_of_word;
    private Direction direction;

    public Position(int x_coordinate_of_word, int y_coordinate_of_word, Direction direction) {
        this.x_coordinate_of_word = x_coordinate_of_word;
        this.y_coordinate_of_word = y_coordinate_of_word;
        this.direction = direction;
    }

    public int getX_coordinate_of_word() {
        return x_coordinate_of_word;
    }

    public int getY_coordinate_of_word() {
        return y_coordinate_of_word;
    }

    public Direction getDirection() {
        return direction;
    }

    public boolean isHorzontal(){
        return direction.equals(Direction.HORIZONTAL);
    }
}

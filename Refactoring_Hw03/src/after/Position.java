package after;
enum Direction{VERTICAL, HORIZONTAL}
public class Position {
    private coordinate coordinate;

    private Direction direction;
    public coordinate getPoint() {
        return coordinate;
    }
    public Position(int x_coordinate_of_word, int y_coordinate_of_word, Direction direction) {
        this.coordinate = new coordinate(x_coordinate_of_word,y_coordinate_of_word);
        this.direction = direction;
    }
    public boolean is_cross(Position position, int length_ ,int length){
        return isHorzontal() ? (position.isHorzontal() ? coordinate.is_horizontally_overlap(position.getPoint(),length_,length) : coordinate.is_horizontally_cross(position.getPoint(),length_,length) )
                            : ( position.isHorzontal() ? coordinate.is_vertically_cross(position.getPoint(),length_,length) : coordinate.is_vertically_overlap(position.getPoint(),length_,length));
    }

    public int getX_coordinate_of_word() {
        return coordinate.getX();
    }

    public int getY_coordinate_of_word() {
        return coordinate.getY();
    }

    public Direction getDirection() {
        return direction;
    }

    public boolean isHorzontal(){
        return direction.equals(Direction.HORIZONTAL);
    }
}

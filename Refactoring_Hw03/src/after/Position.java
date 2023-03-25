package after;
enum Direction{VERTICAL, HORIZONTAL}
public class Position {
    private Point point;

    private Direction direction;
    public Point getPoint() {
        return point;
    }
    public Position(int x_coordinate_of_word, int y_coordinate_of_word, Direction direction) {
        this.point = new Point(x_coordinate_of_word,y_coordinate_of_word);
        this.direction = direction;
    }
    public boolean is_cross(Position position, int length){
        return false;
    }

    public int getX_coordinate_of_word() {
        return point.getPointX();
    }

    public int getY_coordinate_of_word() {
        return point.getPointY();
    }

    public Direction getDirection() {
        return direction;
    }

    public boolean isHorzontal(){
        return direction.equals(Direction.HORIZONTAL);
    }
}

package after;

public class coordinate {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public boolean is_vertically_cross(coordinate coordinate, int length_, int length){
        return x >= coordinate.getX() && x <= coordinate.getX() + length_ && coordinate.getY() >= y && coordinate.getY() <= y + length;

    }
    public boolean is_horizontally_cross(coordinate coordinate, int length_, int length){
        return coordinate.getX() >= x && coordinate.getX() <= x + length && y >= coordinate.getY() && y <= coordinate.getY() + length_;
    }
    public boolean is_vertically_overlap(coordinate coordinate, int length_, int length){
        return coordinate.getX() == x && ((y >= coordinate.getY() && y <= coordinate.getY() + length_)
                || (y + length >= coordinate.getY() && y + length <= coordinate.getY() + length_));
    }
    public boolean is_horizontally_overlap(coordinate coordinate, int length_, int length){
        return coordinate.getY() == y
                && ((x >= coordinate.getX() && x <= coordinate.getX() + length_) || (x + length >= coordinate.getX() && x + length <= coordinate.getX() + length_));
    }

}

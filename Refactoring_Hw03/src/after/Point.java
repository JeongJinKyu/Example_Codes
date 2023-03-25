package after;

public class Point {
    private int point;

    public Point(int point) {
        this.point = point;
    }

    public int getPoint(boolean is_horizontal){
        return is_horizontal ? point : point*2;
    }
}

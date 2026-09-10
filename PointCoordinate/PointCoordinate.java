package Lec08.PointCoordinate;

public class PointCoordinate {

    private Double x;
    private Double y;

    public PointCoordinate(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public double getx() {
        return x;
    }

    public double gety() {
        return y;
    }

    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }
}

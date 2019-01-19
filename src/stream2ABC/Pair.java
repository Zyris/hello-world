package stream2ABC;

public class Pair<X, Y> {
    private final X x;
    private final Y y;

    public X getX() {
        return x;
    }

    public Y getY() {
        return y;
    }

    public Pair(X x, Y y) {

        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

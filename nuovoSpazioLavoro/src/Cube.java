import java.util.Arrays;
import java.util.Iterator;

public class Cube implements Polyhedron {
    private double side;

    @Override
    public double perimeter() {
        return side*12;
    }

    @Override
    public double area() {
        return 6*(side*side);
    }

    @Override
    public double volume() {
        return side*side*side;
    }

    @Override
    public PositionedPolyhedron at(Point origin) {
        return new PositionedPolyhedron() {
            @Override
            public Point origin() {
                return origin;
            }
            @Override
            public Iterator<Point> iterator() {
                final Point u=origin.move(side,side,side);
                final Point[] ps = new Point[]{
                        origin,origin.move(side,0.,0.), origin.move(0.,side,0.), origin.move(0.,0.,side),
                        u,u.move(side,0.,0.), u.move(0.,side,0.), u.move(0.,0.,side),
                };
                return Arrays.asList(ps).iterator();
            }
        };
    }
    Cube(double x){
        this.side=x;
    }
}

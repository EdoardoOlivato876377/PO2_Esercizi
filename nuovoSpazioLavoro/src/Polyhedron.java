public interface Polyhedron extends Solid {
    double perimeter();
    @Override
    PositionedPolyhedron at(Point origin);
}
public class Sphere implements Solid{
    private double ray;
    public Sphere(double ray){
        this.ray=ray;
    }

    @Override
    public double area() {
        return 4*3.14*(ray*ray);
    }

    @Override
    public double volume() {
        return 4*3.14*(ray*ray*ray)/3;
    }

    @Override
    public PositionedSolid at(Point origin) {
        return new PositionedSolid() {
            @Override
            public Point origin() {
                return origin;
            }
        };
    }
}

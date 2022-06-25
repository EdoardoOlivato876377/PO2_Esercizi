public class Point {
    public double x, y, z;
    public Point move (double dx, double dy, double dz){
        this.x=x+dz;
        this.y=y+dy;
        this.z=z+dz;
        return new Point(x,y,z);
    }
    public Point(double x, double y, double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
}

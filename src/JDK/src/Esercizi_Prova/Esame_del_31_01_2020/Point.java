package Esercizi_Prova.Esame_del_31_01_2020;

public class Point {
    public final double x, y, z;
    public Point(double x,double y, double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    Point move(double dx, double dy, double dz){
        double x1,y1,z1;
        x1=dx+this.x;
        y1=dy+this.y;
        z1=dz+this.z;
        Point p;
        return p = new Point(x1, y1, z1);
    }
}

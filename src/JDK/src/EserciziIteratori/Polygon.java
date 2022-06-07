package EserciziIteratori;

import java.util.Iterator;
import java.util.List;

/*
public abstract class Polygon {
    protected final List<Point> points;

    protected Polygon(List<Point> points){
        assert points.size()>=3;
        this.points=points;
    }

    public Iterator<Point> lineInterator() {
        Iterator<Point> it = points.iterator();
        final Point[] last = new Point[1];
        return new Iterator<>(){
        public boolean hasNext(){
            return it.hasNext();
        }

        public Line next(){
            Point p = it.next();
            Line r = new Line(last[0], p);
            last[0] = p;
            return r;
        }
    };

}

   public double perimeter(){
        Iterator <Line> it=lineInterator();
        double result=0;
        while(it.hasNext()){
            result=it.next().length();
        }
        return result;
    }

    public abstract double area();
}

*/

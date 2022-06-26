import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cube cube1 = new Cube(11.), cube2 = new Cube(23.);
        Sphere sphere1 = new Sphere(12.), sphere2 = new Sphere(35.);
        List<Solid> solids = List.of(cube1, cube2, sphere1, sphere2);
        List<Cube> cubes = List.of(cube1, cube2);
        List<Sphere> spheres = List.of(sphere1, sphere2);
        List<? extends Polyhedron> polys = cubes;

        Collections.sort(cubes);

        Collections.sort(spheres, Solid.comparatorBy(Sphere::area));


    }

    /*
    Si implementi uno snippet di codice Java che, per ogni poliedro della lista polys,
    lo posiziona in un punto dello spazio a piacere e poi ne stampa in standard output
    tutti i punti.
     */

}

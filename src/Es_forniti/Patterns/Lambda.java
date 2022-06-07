package Patterns;

import Functional.TestFun;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Lambda {
    public void m(){

        // Output & Input
        Function<Integer, Integer> f = (a) -> {
            return a * 2;
        };

        //Solo Output
        Supplier<String> supp = () -> {
            return "String";
        };

        //Solo Input
        Consumer<Double> cons = (d) -> {
            System.out.println(d);
        };

        //Nè Output nè Input
        Runnable r = () -> {
            cons.accept(new Random().nextDouble());
        };

        System.out.println(f.apply(19));
        System.out.println(supp);
        cons.accept(40.0);
        r.run();
    }
}

package Figures;

import java.util.Random;

public class Circle implements Shape {
    double r= 0;

    void generate() {
        r = new Random().nextInt(100) + 1;
    }

    @Override
    public double getPerimeter() {
        return 2*r*Math.PI;
    }
}

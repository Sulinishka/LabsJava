package Figures;

import java.util.Random;

public class Triangle implements Shape {
    double side1= 0;
    double side2= 0;
    double side3= 0;

    void generate() {
        side1 = new Random().nextInt(100) + 1;
        side2 = new Random().nextInt(100) + 1;
        side3 = new Random().nextInt(100) + 1;
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}

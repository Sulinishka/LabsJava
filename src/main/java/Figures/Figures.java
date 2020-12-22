package Figures;

public class Figures {

    public static void main(String[] args) {
        Shape[] shape = new Shape[30];
        for (int i = 0; i < 10; i++) {
            Rectangle rectangle = new Rectangle();
            rectangle.generate();
            shape[i] = rectangle;
        }
        for (int i = 10; i < 20; i++) {
            Triangle triangle = new Triangle();
            triangle.generate();
            shape[i] = triangle;

        }
        for (int i = 20; i < 30; i++) {
            Circle circle = new Circle();
            circle.generate();
            shape[i] = circle;
        }

        Shape max = shape[0];
        Shape min = shape[1];
        for (int i = 0; i < 30; i++) {
            Shape shape1 = shape[i];
            if(max.getPerimeter() < shape1.getPerimeter()) {
                max = shape1;
            }

            if(min.getPerimeter() > shape1.getPerimeter()) {
                min = shape1;
            }
        }

        System.out.println(max.getPerimeter());
        System.out.println(min.getPerimeter());
    }
}

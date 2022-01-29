package ClassesAndObjects.exercise.ShapesParameters;

public class Circle extends Shapes {
    private final double pi = Math.PI;
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return pi*radius*radius;
    }

    @Override
    public double perimeter() {
        return 2*pi*radius;
    }

}

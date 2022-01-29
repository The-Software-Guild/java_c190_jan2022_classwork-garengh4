package ClassesAndObjects.exercise.ShapesParameters;

public class Rectangle extends Shapes {
    private final double width;
    private final double length;

    // Constructor
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        return width * length;
    }

    @Override
    public double perimeter() {
        return (width + length) * 2;
    }

}

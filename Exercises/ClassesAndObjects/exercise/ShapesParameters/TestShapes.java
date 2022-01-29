package ClassesAndObjects.exercise.ShapesParameters;

public class TestShapes {
    public static void main(String[] args) {
        // Rectangle test
        double width = 5;
        double length = 7;
        Shapes rectangle = new Rectangle(width, length);
        System.out.println("Shape: Rectangle");
        System.out.println("Width:" + width);
        System.out.println("Length: " + length);
        System.out.println("Perimeter: " + rectangle.perimeter());
        System.out.println("Area: " + rectangle.area());
        System.out.println("--------------------------");

        // Circle test
        double radius = 5;
        Shapes circle = new Circle(radius);
        System.out.println("Shape: Circle");
        System.out.println("Radius: " + radius);
        System.out.println("Perimeter: " + circle.perimeter());
        System.out.println("Area: " + circle.area());
        System.out.println("--------------------------");
    }
}

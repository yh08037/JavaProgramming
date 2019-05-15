import geometric.Circle;
import geometric.Rectangle;

public class TestCircleRectangle {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        System.out.println("A circle:");
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());
        circle.print();

        Rectangle rectangle = new Rectangle(2, 4);
        System.out.println("\nA rectangle:");
        System.out.println("The area is " + circle.getArea());
        System.out.println("The perimeter is " + circle.getPerimeter());
        rectangle.print();
    }
}

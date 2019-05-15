import geometric.*;

public class CastingDemo2 {
    public static void main(String[] args) {
        display(new Circle(3.5));
        display(new Rectangle(4, 5));
        display(new Trapezoid(4, 5, 6));
        display(new Diamond(4, 5));
        display(new Ellipse(4, 5));
    }

    public static void display(Object obj) {
        if (obj instanceof Circle) {
            System.out.println("The circle area is " + ((Circle)obj).getArea());
        } else if (obj instanceof Rectangle) {
            System.out.println("The rectangle area is " + ((Rectangle)obj).getArea());
        } else if (obj instanceof Trapezoid) {
            System.out.println("The trapezoid area is " + ((Trapezoid)obj).getArea());
        } else if (obj instanceof Diamond) {
            System.out.println("The diamond area is " + ((Diamond)obj).getArea());
        } else if (obj instanceof Ellipse) {
            System.out.println("The ellipse area is " + ((Ellipse)obj).getArea());
        } else {
            System.out.println();
        }
    }
}

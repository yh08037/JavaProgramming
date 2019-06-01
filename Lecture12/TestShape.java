public class TestShape {
    public static void main(String[] args) {
        Point p = new Point(1, 1);
        Shape[] arr = {
            new Rectangle(p, 3, 4),
            new Parallelogram(p, 5, 6, Math.PI/6.0),
            new Trapezoid(p, 5, 6, 2)
        };
        System.out.println("SUM_AREA = " + sumArea(arr));
    }

    static double sumArea(Shape[] arr) {
        double sum = 0;
        for (Shape s : arr) sum += s.getArea();
        return sum;
    }
}

class Point {
    double x, y;

    Point() { this(0, 0); }
    Point(double x, double y) { this.x = x; this.y = y; }

    public String toString() { return "[" + x + ", " + y + "]"; }
}

abstract class Shape {
    private Point position;

    protected Shape() { position = new Point(); }
    protected Shape(Point p) { position = p; }

    public Point getPosition() { return position; }
    public void setPosition(Point p) { position = p; }
    public abstract double getArea();
}

abstract class Quadrangle extends Shape {
    protected double width;
    protected double height;

    protected Quadrangle(Point p, double w, double h) {
        setPosition(p); width = w; height = h;
    }

    public double getWidth() { return width; }
    public double getHeight() { return height; }
    public void setWidth(double w) { width = w; }
    public void setHeight(double h) { height = h; }
}

class Rectangle extends Quadrangle {
    public Rectangle(Point p, double w, double h) { super(p, w, h); }

    public boolean isSqaure() { return width == height; }

    @Override
    public double getArea() { return width * height; }
}

class Parallelogram extends Quadrangle {
    private double angle;

    public Parallelogram(Point p, double w, double h, double angle) {
        super(p, w, h); this.angle = angle;
    }

    public double getAngle() { return angle; }
    public void setAngle(double a) { angle = a; }

    @Override
    public double getArea() { return width * height * Math.sin(angle); }
}

class Trapezoid extends Quadrangle {
    private double top_width;

    public Trapezoid(Point p, double w, double h, double top_width) {
        super(p, w, h); this.top_width = top_width;
    }

    public double getTopWidth() { return top_width; }
    public void setTopWidth(double tw) { top_width = tw; }

    @Override
    public double getArea() { return (width + top_width) * height / 2; }
}

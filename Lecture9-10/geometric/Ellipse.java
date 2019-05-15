package geometric;

public class Ellipse extends GeometricObject {
    private double a;
    private double b;

    public Ellipse() { }
    public Ellipse(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public Ellipse(double a, double b, String color, boolean filled) {
        this.a = a;
        this.b = b;
        setColor(color);
        setFilled(filled);
    }

    public double getA() { return a; }
    public void setA(double a) { this.a = a; }

    public double getB() { return b; }
    public void setB(double b) { this.b = b; }

    public double getArea() { return Math.PI * a * b; }

    public String toString() {
        return "ellipse, a " + a + " b " + b + "\n" + super.toString();
    }
}

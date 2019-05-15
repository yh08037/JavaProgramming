package geometric;

public class Trapezoid extends GeometricObject {
    private double width1;
    private double width2;
    private double height;

    public Trapezoid() { }
    public Trapezoid(double width1, double width2, double height) {
        this.width1 = width1;
        this.width2 = width2;
        this.height = height;
    }
    public Trapezoid(double width1, double width2, double height, String color, boolean filled) {
        this.width1 = width1;
        this.width2 = width2;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

    public double getWidth1() { return width1; }
    public void setWidth1(double width1) { this.width1 = width1; }

    public double getWidth2() { return width2; }
    public void setWidth2(double width2) { this.width2 = width2; }

    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    public double getArea() { return (width1 + width2) * height / 2; }

    public String toString() {
        return "trapezoid, width1 " + width1 + " width2 " + width2
            + " height " + height + "\n" + super.toString();
    }
}

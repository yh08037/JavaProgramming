package geometric;

public class Diamond extends GeometricObject {
    private double horizontal;
    private double vertical;

    public Diamond() { }
    public Diamond(double horizontal, double vertical) {
        this.horizontal = horizontal;
        this.vertical = vertical;
    }
    public Diamond(double horizontal, double vertical, String color, boolean filled) {
        this.horizontal = horizontal;
        this.vertical = vertical;
        setColor(color);
        setFilled(filled);
    }

    public double getHorizontal() { return horizontal; }
    public void setHorizontal(double horizontal) { this.horizontal = horizontal; }

    public double getVertical() { return vertical; }
    public void setvertical(double vertical) { this.vertical = vertical; }

    public double getArea() { return horizontal * vertical / 2; }

    public String toString() {
        return "diamond, horizontal " + horizontal + " vertical " + vertical
            + "\n" + super.toString();
    }
}

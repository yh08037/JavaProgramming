public class TestShapePerimeter {
  public static void main(String args[]) {
    Shape[] arr = {
      new Rectangle(3,4),
      new Parallelogram(5,6,Math.PI/6.0),
      new Trapezoid(8,4,2),
      new Diamond(6,8)
    };

    for (Shape s : arr) {
      System.out.printf("Perimeter of [%s] is %.2f\n",
	    s.toString(), s.getPerimeter());
    }
  }

}

abstract class Shape {
  protected Shape() { }

  public abstract double getArea();
  public abstract double getPerimeter();

  // returns the name of the class
  public String toString() { return this.getClass().getName(); }
}

abstract class Quadrangle extends Shape {
  protected double width, height;
  protected Quadrangle(double width, double height) {
    setWidth(width);
    setHeight(height);
  }

  public double getWidth() { return width; }
  public double getHeight() { return height; }
  public void setWidth(double width) { this.width = width; }
  public void setHeight(double height) { this.height = height; }

  @Override
  public String toString() {
    return super.toString() + String.format(",W:%.1f,H:%.1f",width,height);
  }
}

class Rectangle extends Quadrangle {
  public Rectangle(double width, double height) { super(width,height); }
  public boolean isSquare() { return width == height; }

  public double getArea() { return getWidth() * getHeight(); }
  public double getPerimeter() { return 2 * (getWidth() + getHeight()); }
}

class Parallelogram extends Quadrangle {
  private double angle;
  public Parallelogram(double width, double height, double angle) {
    super(width,height);
    setAngle(angle);
  }

  public double getAngle() { return angle; }
  public void setAngle(double angle) { this.angle = angle; }

  public double getArea() { return getWidth() * getHeight(); }
  public double getPerimeter() { return 2 * (getWidth() + getHeight() / Math.sin(angle)); }

  public String toString() {
    return super.toString() + String.format(",A:%.3fpie", angle / Math.PI);
  }
}

class Trapezoid extends Quadrangle {
  private double top_width;
  public Trapezoid(double width, double height, double top_width) {
    super(width,height);
    setTopWidth(top_width);
  }

  public double getTopWidth() { return top_width; }
  public void setTopWidth(double top_width) { this.top_width = top_width; }

  public double getArea() { return getWidth() * getHeight(); }
  public double getPerimeter() {
    double l1 = (getWidth() - getTopWidth()) / 2;
    double len = Math.sqrt(l1 * l1 + getHeight() * getHeight());
    return getWidth() + getTopWidth() + 2 * len;
  }

  public String toString() {
    return super.toString() + String.format(",Wtop:%.1f", getTopWidth());
  }
}

class Diamond extends Quadrangle {
  public Diamond(double width, double height) { super(width,height); }
  public boolean isSquare() { return width == height; }

  public double getArea() { return getWidth() * getHeight() / 2; }
  public double getPerimeter() {
    return 2 * Math.sqrt(getWidth()*getWidth() + getHeight()*getHeight());
  }
}

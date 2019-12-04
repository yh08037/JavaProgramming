//  2018115809, ±èµµÈÆ, COMP217001, Homewwork 2-2

public class Complex extends Number implements Comparable<Complex> {
    private double real;
    private double imag;

    public Complex() { set(0, 0); }
    public Complex(double re, double im) { set(re, im); }
    public Complex(Complex other) { set(other); }

    public double re() { return real; }
    public double im() { return imag; }
    public double abs() { return Math.sqrt(real * real + imag * imag); }
    // absolute value of the complex value, real^2 + imag^2

    public void set(double re, double im) {
        real = re;
        imag = im;
    }

    public void set(Complex a) {
        real = a.re();
        imag = a.im();
    }

    // arithmetic operators
    public void add(Complex a, Complex b) {
        real = a.re() + b.re();
        imag = a.im() + b.im();
    }

    public void sub(Complex a, Complex b) {
        real = a.re() - b.re();
        imag = a.im() - b.im();
    }

    public void mul(Complex a, Complex b) { // this = a*b
        real = a.re() * b.re() - a.im() * b.im();
        imag = a.re() * b.im() + a.im() * b.re();
    }

    // should return a String in the form of "(3.1+6.4i)" or "(-3.1-6.4i)"
    // according to the signs. Double values are represented by
    // 1 digit after the decimal point
    @Override
    public String toString() {
        if (this.imag < 0)
            return "(" + String.format("%.1f", real) + "" + String.format("%.1f", imag) + "i)";
        else
            return "(" + String.format("%.1f", real) + "+" + String.format("%.1f", imag) + "i)";
    }

    @Override
    // Override the equals method in the Object class
    public boolean equals(Object other) {
        if (other instanceof Complex) {
            return (real == ((Complex) other).re()) && (imag == ((Complex) other).im());
        } else return false;
    }

    /* The below methods are required for Number extension */
    @Override
    // returns integer-casted absolute value
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    // Implement the abstract floatValue method in Number
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    // returns absolute value
    public double doubleValue() {
        return abs();
    }

    @Override
    // Implement the abstract longValue method in Number
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    // Implement the compareTo method in interface Comparable
    // returns 1 if |this| > |o|; -1 if |this| < |o|; 0 if |this| == |o|
    public int compareTo(Complex o) {
        if (this.abs() > o.abs()) return 1;
        else if (this.abs() == o.abs()) return 0;
        else return -1;
    }
}

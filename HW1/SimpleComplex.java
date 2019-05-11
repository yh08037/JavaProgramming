/* 김도훈 2018115809 */

public class SimpleComplex {
    private double real;
    private double imag;

    public SimpleComplex() { set(0, 0); }
    public SimpleComplex(double re, double im) { set(re, im); }
    public SimpleComplex(SimpleComplex other) { set(other); }

    public double re() { return this.real; }
    public double im() { return this.imag; }
    public double abs() {
        return Math.sqrt(this.real * this.real + this.imag * this.imag);
    }

    public void set(double re, double im) {
        this.real = re;
        this.imag = im;
    }
    public void set(SimpleComplex a) {
        this.real = a.re();
        this.imag = a.im();
    }

    public void add(SimpleComplex a, SimpleComplex b) {
        this.real = a.re() + b.re();
        this.imag = a.im() + b.im();
    }
    public void sub(SimpleComplex a, SimpleComplex b) {
        this.real = a.re() - b.re();
        this.imag = a.im() - b.im();
    }
    public void mul(SimpleComplex a, SimpleComplex b) {
        this.real = a.re() * b.re() - a.im() * b.im();
        this.imag = a.re() * b.im() + a.im() * b.re();
    }

    public String toString() {
        if (this.imag < 0)
            return "(" + Math.round(this.real*10)/10.0 + "" + Math.round(this.imag*10)/10.0 + "i)";
        else
            return "(" + Math.round(this.real*10)/10.0 + "+" + Math.round(this.imag*10)/10.0 + "i)";
    }

    public boolean equals(SimpleComplex other) {
        return (this.real == other.re()) && (this.imag == other.im());
    }

    public int compareTo(SimpleComplex o) {
        double tmp = this.abs() - o.abs();
        if ( tmp > 0 ) return 1;
        else if ( tmp == 0) return 0;
        else return -1;
    }

}

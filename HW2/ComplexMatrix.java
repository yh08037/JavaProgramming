//  2018115809, ±èµµÈÆ, COMP217001, Homewwork 2-3

public class ComplexMatrix extends GenericMatrix<Complex> {
    @Override
    /** Add two complex numbers */
    protected Complex add(Complex o1, Complex o2) {
        if (o1 == null) o1 = zero();
        if (o2 == null) o2 = zero();
        Complex result = new Complex();
        result.add(o1, o2);
        return result;
    }

    @Override
    /** Multiply two complex numbers */
    protected Complex multiply(Complex o1, Complex o2) {
        if (o1 == null) o1 = zero();
        if (o2 == null) o2 = zero();
        Complex result = new Complex();
        result.mul(o1, o2);
        return result;
    }

    @Override
    /** Specify zero for a complex number */
    protected Complex zero() {
        return new Complex();
    }

    @Override
    /** Returns string representation */
    protected String str(Complex o) {
        /* represents (1.0+2.0i), (1.0-2.0i), (-1.0+2.0i), or (-1.0-2.0i)
         * depending on the sign of Im()
         * this is the same as class Complex's toString, so you can reuse it */
        return o.toString();
    }
}

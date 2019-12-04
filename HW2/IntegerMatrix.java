//  2018115809, ±èµµÈÆ, COMP217001, Homewwork 2-3

public class IntegerMatrix extends GenericMatrix<Integer> {
    @Override
    /** Add two integers */
    protected Integer add(Integer o1, Integer o2) {
        if (o1 == null) o1 = zero();
        if (o2 == null) o2 = zero();
        return o1 + o2;
    }

    @Override
    /** Multiply two integers */
    protected Integer multiply(Integer o1, Integer o2) {
        if (o1 == null) o1 = zero();
        if (o2 == null) o2 = zero();
        return o1 * o2;
    }

    @Override
    /** Specify zero for an integer */
    protected Integer zero() {
        return 0;
    }

    @Override
    /** Returns string representation */
    protected String str(Integer o) {
        return o.toString();
    }
}

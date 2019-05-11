/* 김도훈 2018115809 */

public class TestSimpleComplex {
    public static void main(String[] args) {
        SimpleComplex c1 = new SimpleComplex(5.2, 3.5);
        SimpleComplex c2 = new SimpleComplex(2.3, -7.2);
        SimpleComplex c3 = new SimpleComplex(c1);
        SimpleComplex c4 = new SimpleComplex();
        c4.set(c2);
        SimpleComplex c5 = new SimpleComplex();

        System.out.println("c3 = " + c3);
        System.out.println("c4 = " + c4);

        int r = c1.compareTo(c2);
        String op;
        switch (r){
            case 1: op = ">"; break;
            case -1: op = "<"; break;
            case 0: op = "=="; break;
            default: op = "?";
        }
        System.out.format("|%s| = %.2f %s |%s| = %.2f\n",
                c1.toString(), c1.abs(), op, c2.toString(), c2.abs());

        System.out.println(c1 + " == " + c3 + " = " + c3.equals(c1));
        System.out.println(c1 + " == " + c4 + " = " + c1.equals(c4));

        c5.add(c1, c2);
        System.out.println(c1 + " + " + c2 + " = " + c5);
        c5.sub(c2, c3);
        System.out.println(c2 + " - " + c3 + " = " + c5);
        c5.mul(c3, c4);
        System.out.println(c3 + " * " + c4 + " = " + c5);
    }
}

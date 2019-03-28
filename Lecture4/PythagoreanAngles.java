public class PythagoreanAngles {
    public static void main(String[] args ) {
        double AB = 4;
        double AC = 3;

        double alpha = Math.atan(AC / AB);
        double beta = Math.atan(AB / AC);

        System.out.println(
            "alpha = " + Math.round(alpha*100)/100.0 + " radians, " +
            Math.round(Math.toDegrees(alpha)*100)/100.0 + " degrees" );
        System.out.println(
            "beta = " + Math.round(beta*10)/10.0 + " radians, " +
            Math.round(Math.toDegrees(beta)*10)/10.0 + " degrees" );
    }
}

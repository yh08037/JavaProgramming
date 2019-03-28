public class Ex43_exercises {
    public static void main(String[] args) {

        double a, b, c, d;

        a = Math.atan(Math.sin(Math.toRadians(32)) * Math.cos(Math.toRadians(32)));

        b = Math.pow(Math.pow(Math.E, 1.67) * Math.pow(1.65, Math.log(8)/Math.log(20)), 1.0/4.0);

        c = Math.log(Math.pow(21, Math.log(35)))/Math.log(7);

        d = Math.exp(Math.sqrt(Math.log(4))+Math.sqrt(Math.log(5)));

        System.out.println(a +" "+ b +" "+ c +" "+ d);
    }
}

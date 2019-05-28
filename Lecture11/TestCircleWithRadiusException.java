public class TestCircleWithRadiusException {
    public static void main(String[] args) {
        try {
            CircleWithRadiusException c1 = new CircleWithRadiusException(-5);
            CircleWithRadiusException c2 = new CircleWithRadiusException(0);
            CircleWithRadiusException c3 = new CircleWithRadiusException(200);
        }
        catch (RadiusLessThanOrEqualToZeroException ex) { System.out.println(ex); ex.printStackTrace(); }
        catch (RadiusLargerThanOrEqualTo100Exception ex) { System.out.println(ex); ex.printStackTrace(); }

        System.out.println("Number of objects created: " + CircleWithRadiusException.getNumberOfObject());
    }
}

class InvalidRadiusExcpetion extends Exception {
    private double radius;

    public InvalidRadiusExcpetion(double radius) {
        super("Invalid radius " + radius);
        this.radius = radius;
    }

    public double getRadius() { return radius; }
}

class RadiusLessThanOrEqualToZeroException extends InvalidRadiusExcpetion {
    public RadiusLessThanOrEqualToZeroException(double radius) { super(radius); }
}

class RadiusLargerThanOrEqualTo100Exception extends InvalidRadiusExcpetion {
    public RadiusLargerThanOrEqualTo100Exception(double radius) { super(radius); }
}


class CircleWithRadiusException {
    private double radius;
    private static int numberOfObject = 0;

    public CircleWithRadiusException(double newRadius) throws RadiusLessThanOrEqualToZeroException, RadiusLargerThanOrEqualTo100Exception {
        try { setRadius(newRadius); numberOfObject++; }
        catch (RadiusLessThanOrEqualToZeroException ex) { throw ex; }
        catch (RadiusLargerThanOrEqualTo100Exception ex) { throw ex; };
    }

    public double getRadius() { return radius; }
    public void setRadius(double newRadius) throws RadiusLessThanOrEqualToZeroException, RadiusLargerThanOrEqualTo100Exception {
        if (newRadius <= 0) throw new RadiusLessThanOrEqualToZeroException(newRadius);
        else if (newRadius >= 100) throw new RadiusLargerThanOrEqualTo100Exception(newRadius);
        else radius = newRadius;
    }

    public static int getNumberOfObject() { return numberOfObject; }
    public double findArea() { return radius * radius * Math.PI; }
}

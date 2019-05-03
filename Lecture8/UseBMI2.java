public class UseBMI2 {
    public static void main(String[] args) {
        BMI2 b1 = new BMI2("John Doe", 18, 145, 70);
        System.out.println("The BMI for " + b1.name + " is " + b1.getBMI() + " " + b1.getStatus());
        BMI2 b2 = new BMI2("Peter King", 20, 215, 70);
        System.out.println("The BMI for " + b2.name + " is " + b2.getBMI() + " " + b2.getStatus());
    }
}
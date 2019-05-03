public class UseBMI1 {
    public static void main(String[] args) {
        BMI1 b1 = new BMI1("John Doe", 18, 145, 70);
        System.out.println("The BMI for " + b1.name + " is " + b1.getBMI() + " " + b1.getStatus());
        BMI1 b2 = new BMI1("Peter King", 20, 215, 70);
        System.out.println("The BMI for " + b2.name + " is " + b2.getBMI() + " " + b2.getStatus());
    }
}

class BMI1 {
    String name;
    int age;
    double weight;
    double height;

    static final double KILOS_PER_POUND = 0.45359237;
    static final double METERS_PER_INCH = 0.0254;

    BMI1(String newName, int newAge, double newWeight, double newHeight) {
        name = newName; age = newAge;
        weight = newWeight; height = newHeight;
    }

    double getBMI() {
        double weightInKilograms = weight * KILOS_PER_POUND;
        double heightInMeters = height * METERS_PER_INCH;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);
        return Math.round(bmi * 100) / 100.0;
    }

    String getStatus() {
        double bmi = getBMI();
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }
}
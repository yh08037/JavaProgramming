public class BMI2 {
    String name;
    int age;
    double weight;
    double height;

    static final double KILOS_PER_POUND = 0.45359237;
    static final double METERS_PER_INCH = 0.0254;

    BMI2(String newName, int newAge, double newWeight, double newHeight) {
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

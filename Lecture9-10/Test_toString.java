class Car {
    int speed;
    int gear;
    public String color;

    public Car() {
        this.speed = 100;
        this.gear = 5;
        this.color = "silver";
    }

    public Car(int speed, int gear, String color) {
        this.speed = speed;
        this.gear = gear;
        this.color = color;
    }

    public String toString() {
        return "Car: " + speed + "km/h " + gear + "gears " + color;
    }
}

class NamedCar extends Car {
    public String name;

    public NamedCar(String name) { super(); this.name = name; }
    public NamedCar(int speed, int gear, String color, String name) {
        super(speed, gear, color);
        this.name = name;
    }

    public String toString() { return super.toString() + " " + name; }
}

public class Test_toString {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.toString());

        NamedCar c2 = new NamedCar(160, 8, "green", "Pony");
        System.out.println(c2.toString());
    }
}

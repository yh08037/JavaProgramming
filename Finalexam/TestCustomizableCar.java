public class TestCustomizableCar {
  public static void main(String args[]) {
    CustomizableCar car1 = new CustomizableCar();
    CustomizableCar car2 = new CustomizableCar(
        new Engine(50, 200), new Gearbox(true, 3), "Red"
    );

    System.out.println("default car1");
    System.out.println(car1);
    System.out.println();

    System.out.println("initialized car2");
    System.out.println(car2);
    System.out.println();

    car2.repaint("Blue");
    car2.swapEngine(new Engine(230, 9000));
    car2.changeGearbox(new Gearbox(false, 8));

    System.out.println("customed car2");
    System.out.println(car2);
    System.out.println();
  }
}

class Engine {
  private int max_mph;
  private int max_rpm;

  private void init(int max_mph, int max_rpm) {
    /* use setMaxMPH(), setMaxRPM() */
    setMaxMPH(max_mph);
    setMaxRPM(max_rpm);
  }	// set the field values
  private void initDefault() {
    /* FILL - use private initializer init(int, int) */
    init(200, 4000);
  }	// default values: 200 4000

  /* public methods */
  public Engine() { initDefault(); }
  public Engine(int max_mph, int max_rpm) { init(max_mph,max_rpm); }
  public Engine(Engine e) {
    /* FILL - if e is null, use default initializer initDefault();
     * if e is not null, use initializer init(int, int) */
     if (e == null) initDefault();
     else init(e.getMaxMPH(), e.getMaxRPM());
  }

  public int getMaxMPH() { return max_mph; }
  public int getMaxRPM() { return max_rpm; }

  public void setMaxMPH(int max_mph) {
    /* FILL - max_mph should be between 30 and 250 */
    if (max_mph >= 30 && max_mph <= 250) this.max_mph = max_mph;
  }
  public void setMaxRPM(int max_rpm) {
    /* FILL - max_rpm should be between 100 and 11000 */
    if (max_rpm >= 100 && max_rpm <= 11000) this.max_rpm = max_rpm;
  }

  @Override
  public String toString() {
    return max_mph + "km/h" + " " + max_rpm + "rev/m";
  }
}

class Gearbox {
  private boolean is_manual;
  private int max_gear;

  private void init(boolean is_manual, int max_gear) {
    /* FILL - use setIsManual(), setMaxGear() */
    setIsManual(is_manual); setMaxGear(max_gear);
  }	// set the field values
  private void initDefault() {
    /* use initializer init(boolean, int) */
    init(true, 6);
  }	// default values: true 6

  /* public methods */
  public Gearbox() { initDefault(); }
  public Gearbox(boolean im, int mg) { init(im,mg); }
  public Gearbox(Gearbox g) {
    /* FILL - if g is null, use default constructor Gearbox();
     * if g is not null, use constructor Gearbox(int, int) */
     if (g == null) initDefault();
     else init(g.getIsManual(), g.getMaxGear());
  }

  public boolean getIsManual() { return is_manual; }
  public int getMaxGear() { return max_gear; }

  public void setIsManual(boolean is_manual) {
    /* FILL */
    this.is_manual = is_manual;
  }
  public void setMaxGear(int max_gear) {
    /* FILL - max_gear should be between 1 and 10 */
    if (max_gear >= 1 && max_gear <= 10) this.max_gear = max_gear;
  }

  @Override
  public String toString() {
    String out;
    if ( is_manual ) out = "M/T";
    else out = "A/T";

    return out + " " + max_gear + "steps";
  }
}

class Car {
  protected Engine engine;
  protected Gearbox gear;
  protected String color;

  public Car() {
    this(null,null,"Naked");
  }	// default values: default engine, default gearbox, Naked color
  public Car(Engine e, Gearbox g, String color) {
    engine = new Engine(e);
    gear = new Gearbox(g);
    this.color = color;
  }	// set the field values

  public Engine getEngineInfo() { return engine; }
  public Gearbox getGearInfo() { return gear; }
  public String getColor() { return color; }

  @Override
  public String toString() {
    return engine.toString() + " " + gear.toString() + " " + color;
  }
}

class CustomizableCar extends Car {
  public CustomizableCar() { super(); }
  public CustomizableCar(Engine e, Gearbox g, String color) {
    super(e, g, color);
  }

  public void repaint(String color) {
    this.color = color;
  }

  public void swapEngine(Engine e) {
    engine = e;
  }

  public void changeGearbox(Gearbox g) {
    gear = g;
  }
}

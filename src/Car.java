import java.text.DecimalFormat;

public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Car -> startEngine");
    }

    protected void runEngine() {
        System.out.println("Car -> runEngine");
    }

    public void drive(){
        System.out.println("Car -> driving, type is "+ getClass().getSimpleName());
        runEngine();
    }
}

class GasPoweredCar extends Car {

    private double averageKmPerLiter;
    private int cylinders =6;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double averageKmPerLiter, int cylinders) {
        super(description);
        this.averageKmPerLiter = averageKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up, Ready!%n", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Consumption: -> usage exceeds the average: %.2f %n", averageKmPerLiter);
    }
}

class DieselCar extends Car{
    private  double consumptionPerHundred;
    private  int cylinders=3;
    private  double engineSize;

    public DieselCar(String description) {
        super(description);
    }

    public DieselCar(String description, double consumptionPerHundred, int cylinders, double engineSize) {
        super(description);
        this.consumptionPerHundred = consumptionPerHundred;
        this.cylinders = cylinders;
        this.engineSize = engineSize;
    }

    @Override
    public void startEngine() {
        System.out.printf("Diesel -> All %d cylinders are fired up, Ready!%n", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Consumption: -> usage exceeds the average: %.2f %n", consumptionPerHundred);
    }

    @Override
    public void drive() {
        DecimalFormat df = new DecimalFormat("#.#");
        System.out.printf("Diesel engine has a size of %sl %n", df.format(engineSize));
        runEngine();
    }
}

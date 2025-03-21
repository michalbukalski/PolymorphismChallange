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

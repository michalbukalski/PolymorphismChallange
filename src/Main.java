public class Main {

    public static void main(String[] args) {

        Car car = new Car("2022 Red Ferrari GT");
        runRace(car);

        Car renault = new GasPoweredCar("Renault Clio IV", 15.4,4);
        runRace(renault);

        Car skoda = new DieselCar("Skoda Fabia 3",4.5,3,1.4);
        runRace(skoda);

        Car tesla = new ElectricCar("Tesla Model 3", 568,75);
        runRace(tesla);

        Car ferrariHybrid = new Hybrid("Ferrari Hybrid", 16,8,500);
        runRace(ferrariHybrid);
    }

    public static void runRace(Car car){

        car.startEngine();
        car.drive();
    }
}

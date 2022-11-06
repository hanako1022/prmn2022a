package lecture02;

public class Exercise2_3 {
    public static void main(String[] args){
        Engine en = new Engine(4000);
        Tire ti = new Tire(65);
        Tire[] tires = new Tire[4];

        Car car = new Car(tires,en);
        GasStation gas = new GasStation();

        car.run();

        gas.refuel(car);
        car.startEngine();
        car.run();
    }
}

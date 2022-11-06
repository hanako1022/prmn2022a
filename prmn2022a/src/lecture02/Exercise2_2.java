package lecture02;

public class Exercise2_2 {
    public static void main(String[] args){
        Engine en = new Engine(4000);
        Tire ti = new Tire(85);
        Tire[] tires = new Tire[4];

        Car car = new Car(tires,en);
        GasStation gas = new GasStation();

        car.run();

        gas.refuel(car);
        car.run();
    }
}

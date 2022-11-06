package lecture02;

public class Car {
    int fuel;
    Tire[] tires;
    Engine engine;

    Car(Tire[] tires,Engine engine){
        this.tires = tires;
        this.engine = engine;
        fuel = 0;
    }

    void run(){
        if(fuel >= 1){
            fuel = fuel - 1;
            System.out.println("燃料を１消費して走りました 残り：" + fuel);
        }else{
            System.out.println("燃料切れです");
        }
    }

    void startEngine(){
        engine.start();
    }
}

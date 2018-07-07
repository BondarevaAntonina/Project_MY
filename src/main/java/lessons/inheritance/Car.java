package lessons.inheritance;

import java.io.Serializable;

public abstract class Car implements Drivable {
    private String name;

    public static int age = 0;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Car");
    }

    @Override
    public void drive() {
        System.out.println("Drive car");
    }

    @Override
    public void run() {

    }

    public abstract void foo();
}


class Bmw extends Car {//is-a
    private String specificBmw;//has-a

    public static int age = 0;


    public Bmw(String name, String specificBmw) {
        super(name);
        this.specificBmw = specificBmw;
    }

    public String getSpecificBmw() {
        return specificBmw;
    }

    public void setSpecificBmw(String specificBmw) {
        this.specificBmw = specificBmw;
    }

    @Override
    public void print() {

    }

    @Override
    public void drive() {
        System.out.println("");
    }

    @Override
    public void foo() {

    }
}


class Mercedes extends Car {
    private String specificMercedes;

    public Mercedes(String name, String specificMercedes) {
        super(name);
        this.specificMercedes = specificMercedes;
    }

    @Override
    public void foo() {

    }
}

class TestInheritance {
    public static void main(String[] args) {
        Bmw bmw = new Bmw("BMW", "X5");
        Bmw.age = 5;

//        Car car = new Bmw("BMW1", "X5");
        Runnable car = new Bmw("BMW1", "X5");
        car.run();

    }
}

interface Drivable extends Runnable, Serializable {
    int PATH = 5;

    public abstract void drive();

    default void print() {

    }
}

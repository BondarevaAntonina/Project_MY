package lessons.patterns;

/*
 * Creational pattern
 * */
public class Fabric {
    public static void main(String[] args) {
        CarFabric fabric = new CarFabric();
        System.out.println(fabric.getCar("Audi").getModel());
    }

}

interface SomeCar {
    String getModel();
}

interface CarCreator {
    SomeCar getCar(String model);
}

class Bmw implements SomeCar {
    @Override
    public String getModel() {
        return "Bmw";
    }
}

class Audi implements SomeCar {
    @Override
    public String getModel() {
        return "Audi";
    }
}

class CarFabric implements CarCreator {
    @Override
    public SomeCar getCar(String model) {
        switch (model) {
            case "BMW":
                return new Bmw();
            case "Audi":
                return new Audi();

            default:
                return null;
        }
    }
}



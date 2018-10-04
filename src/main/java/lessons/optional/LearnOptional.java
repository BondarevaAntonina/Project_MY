package lessons.optional;

import java.nio.file.FileSystemNotFoundException;
import java.util.Objects;
import java.util.Optional;

public class LearnOptional {

    public static void main(String[] args) {
        Driver driver = new Driver(null);

        Car car = new Car(null);

        Driver driver1 = car.getDriver();

       /* if (Objects.nonNull(driver1)) {
            if (Objects.nonNull(driver1.getName())) {
//                System.out.println(driver1.getName());
            }
        }*/

        System.out.println(driver1.getName());

        Optional<String> opt = Optional.of("John");

        Optional<String> opt1 = Optional.ofNullable(null);

        Optional<String> opt2 = Optional.empty();

//        System.out.println(opt2);

//        opt1.ifPresent(val -> System.out.println(val.toUpperCase()));

//        System.out.println(opt2.isPresent());

//        System.out.println(opt1.orElse("Jack"));
//        System.out.println(opt1.orElseGet(() -> "Jack"));
//        System.out.println(opt1.orElseThrow(() -> new FileSystemNotFoundException("String doesn't found")));

    }

}

class Car {
    private Driver driver;

    public Car(Driver driver) {
        this.driver = Optional.ofNullable(driver).orElse(new Driver("Helper"));
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}

class Driver {
    private String name;

    public Driver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
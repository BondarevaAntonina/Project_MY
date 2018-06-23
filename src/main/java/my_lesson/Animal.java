package my_lesson;

import java.io.IOException;

/**
 * Created by antoni on 23.03.2018.
 */
public class Animal  {

    String name = "Some animal";

    public void eat() {
        System.out.println("Lion am eating");
    }

    public void sleep() {
        System.out.println("Lion am sleeping");
    }

    public Object repeat(String param1) throws Exception {
        System.out.println("Lion am sleeping");
        return null;
    }
}

class Sheep  extends Animal{
    @Override
    public Object repeat(String param1) throws IOException {
        return null;
    }
}
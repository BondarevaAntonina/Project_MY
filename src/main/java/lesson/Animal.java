package lesson;

import java.io.IOException;

/**
 * Created by antoni on 23.03.2018.
 */
public class Animal  {

    String name = "Some animal";

    public void eat() {
        System.out.println("Animal am eating");
    }

    public void sleep() {
        System.out.println("Animal am sleeping");
    }

    public Object repeat(String param1) throws Exception {
        System.out.println("Animal am sleeping");
        return null;
    }
}

class Sheep  extends Animal{
    @Override
    public Object repeat(String param1) throws IOException {
        return null;
    }
}
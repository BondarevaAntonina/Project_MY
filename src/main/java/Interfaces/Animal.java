package Interfaces;

/**
 * Created by antoni on 23.03.2018.
 */
public class Animal {
    public int id;

    public Animal(int id) {
        this.id = id;
    }

    public void sleep() {
        System.out.println("I am sleeping");
    }
}

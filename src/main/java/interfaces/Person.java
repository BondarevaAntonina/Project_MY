package interfaces;

/**
 * Created by antoni on 26.03.2018.
 */
public class Person {
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello");
    }

}

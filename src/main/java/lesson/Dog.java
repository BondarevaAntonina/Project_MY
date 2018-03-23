package lesson;

/**
 * Created by antoni on 23.03.2018.
 */
public class Dog extends Animal {

    public void eat(){
        System.out.println("Dog is eating ");
    }
    public void bark(){
        System.out.println("Dog am barking");
    }

    public void showName(){
        System.out.println(name);
    }
}

package lessons.serialization;

import java.io.*;

public class Serializator implements Serializable {
/*
    private String name;
    private transient int age;

    public Serializator(String name, int age) {
        System.out.println("Constructor");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Serializator{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Serializator serializator = new Serializator("John", 25);

        String fileName = "Serializator.fix";

        FileOutputStream fos = new FileOutputStream(fileName);

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        FileInputStream fis = new FileInputStream(fileName);

        ObjectInputStream ois = new ObjectInputStream(fis);

        try (fos; oos; fis; ois) {
            oos.writeObject(serializator);

            Serializator object = (Serializator) ois.readObject();

            System.out.println(object);

        }
    }*/
}

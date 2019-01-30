package homeworks.shapes_square;

import java.io.*;

/**
 * Created by antoni on 27.12.2018.
 */
public class SerializatorQuadrilateral implements Serializable {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileOutputStream fos = new FileOutputStream("Rectangles.txt");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Rectangles rectangles = new Rectangles(7, 4);

        oos.writeObject(rectangles);

        System.out.println(rectangles.getArea());

        oos.flush();

        oos.close();





/*        Rectangles rectangles = new Rectangles(7, 4);

        String fileName = "Rectangles.fix";

        FileOutputStream fos = new FileOutputStream(fileName);

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        FileInputStream fis = new FileInputStream(fileName);

        ObjectInputStream ois = new ObjectInputStream(fis);


        try (fos; oos; fis; ois) {
            oos.writeObject(rectangles);

            Rectangles object = (Rectangles) fis.readObject();

            System.out.println(object);

        }*/

    }
}

package homeworks.shapes_square;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ShapeService {

    public static final String FILE_NAME = "Rectangles.fix";
    private List<Shape> shapes;

    public ShapeService() {
        this.shapes = new ArrayList<>();
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void serializeShapes() throws IOException {

        FileOutputStream fos = new FileOutputStream(FILE_NAME);

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        try (fos; oos) {
            oos.writeObject(shapes);
        }

    }

    public List<Shape> deserializeShapes() throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream(FILE_NAME);

        ObjectInputStream ois = new ObjectInputStream(fis);

        try (fis; ois) {
            return (List<Shape>) ois.readObject();
        }
    }
}

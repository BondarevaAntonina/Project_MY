package homeworks.shapes_square;

public class Rectangles extends Shape {

    public Rectangles(double length, double height) {
        super(length, height);
    }


    @Override
    public double getPerimeter() {
        return getHeight() * 2 + getLength() * 2;
    }


    @Override
    public String toString() {
        return "Rectangles " + getLength() + "\t" + getHeight();
    }
}

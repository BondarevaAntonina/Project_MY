package homeworks.shapes_square;

public class Square extends Shape {

    public Square(double length, double height) {
        super(length, height);
    }

    @Override
    public double getPerimeter() {

        if (getLength() != getHeight()) {
            System.out.println("The length and height of the square must be equal");

            return 0;
        }

        double perimeter = super.getPerimeter() * 2;

        System.out.println("The perimeter of the Square is " + perimeter);

        return perimeter;

    }

    @Override
    public double getArea() {

        if (getLength() != getHeight()) {
            System.out.println("The length and height of the square must be equal");
            return 0;
        }

        return super.getArea();

    }

    @Override
    public String toString() {
        return "Square " + getLength() + "\t" + getHeight();
    }

}

package homeworks.shapes_square;

public class Rectangles  extends Quadrilaterals  {

    public Rectangles(double base, double height) {
        this.length = base;
        this.height = height;
    }

    @Override
    public double getPerimeter(){

        double perimeter = (2 * length) + (2 * height);

        System.out.println("The perimeter of the Rectangle is " + perimeter);

        return perimeter;
    }

    @Override
    public double getArea(){

        double area = length * height;

        System.out.println("The area of the Rectangle is " + area);


        return length * height;
    }
}

package homeworks.shapes_square_circle;

public class Rectangles  extends Quadrilaterals  {

    public Rectangles(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getPerimeter(){

        double perimeter = (2 * base) + (2 * height);

        System.out.println("The perimeter of the Rectangle is " + perimeter);

        return perimeter;
    }

    @Override
    public double getArea(){

        double area = base * height;

        System.out.println("The area of the Rectangle is " + area);


        return base * height;
    }
}

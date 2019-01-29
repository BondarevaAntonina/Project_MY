package homeworks.shapes_square_circle;

public class Square extends Quadrilaterals {

    public Square(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getPerimeter(){

        double perimeter = base * 4;

        if (base == height)
        {
            System.out.println("The perimeter of the Square is " + perimeter);
        } else {
            System.out.println("The base and height of the square must be equal");
        }

        return perimeter;

    }

    @Override
    public double getArea(){

        double area = base * base;

        if (base == height)
        {
            System.out.println("The area of the Square is " + area);
        } else {
            System.out.println("The base and height of the square must be equal");
        }

        return area;
    }
}

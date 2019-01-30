package homeworks.shapes_square;

public class Square extends Quadrilaterals {


    public Square(double base, double height) {
        this.length = base;
        this.height = height;
    }

    @Override
    public double getPerimeter(){

        double perimeter = length * 4;

        if (length == height)
        {
            System.out.println("The perimeter of the Square is " + perimeter);
        } else {
            System.out.println("The length and height of the square must be equal");
        }

        return perimeter;

    }

    @Override
    public double getArea(){

        double area = length * length;

        if (length == height)
        {
            System.out.println("The area of the Square is " + area);
        } else {
            System.out.println("The length and height of the square must be equal");
        }

        return area;
    }



}

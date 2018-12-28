package homeworks.serializator_square_rectangle;

/**
 * Created by antoni on 28.12.2018.
 */
public class Rectangle {

    private double width;
    private double height;

    Rectangle(double w, double h)
    {
        this.width = w;
        this.height = h;
    }

    public double perimeter()
    {
        return 2.0*(this.width + this.height);
    }

    public double area()
    {
        return this.width*this.height;
    }
}

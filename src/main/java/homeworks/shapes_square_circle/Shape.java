package homeworks.shapes_square_circle;

/**
 * Please create an abstarct class Shape and two subclasses Square and Circle. Replace code in method drawShape()
 * according to principles of polymorphism. Please propose the other solutions for improving quality of the code.
 */

public abstract class Shape {

    //other fields

    public abstract void drawShape();

}

class Circle extends Shape {
    @Override
    public void drawShape() {
        System.out.println("Drawing Circle");
    }
}

class Square extends Shape {
    @Override
    public void drawShape() {
        System.out.println("Drawing Square");
    }
}

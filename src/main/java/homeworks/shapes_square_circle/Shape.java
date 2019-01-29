package homeworks.shapes_square_circle;

/**
 * Create classes Square and Rectangles with methods for calculating of perimeter and square.
 * Give your suggestions about relations between classes
 * (is-a, has-a, use-a, etc.). Write well commented code with examples of using these classes.
 *
 * Создайте классы Square(Площадь) и Rectangles (Прямоугольники) с методами расчета периметра и квадрата.
 * Дайте свои предложения об отношениях между классами
 * (is-a, has-a, use-a и т. д.). Напишите хорошо прокомментированный код с примерами использования этих классов
 */

public interface  Shape {

    //other fields

    double getPerimeter();
    double getArea();

}

abstract class Quadrilaterals implements Shape{

    double base,height;


    public int getNumberofSidesForQuadrilaterals(){

        final int sides = 4;
        return sides;
    }

}









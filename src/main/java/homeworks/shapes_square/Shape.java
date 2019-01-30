package homeworks.shapes_square;

import java.io.Serializable;

/**
 * Create classes Square and Rectangles with methods for calculating of perimeter and square.
 * Give your suggestions about relations between classes
 * (is-a, has-a, use-a, etc.). Write well commented code with examples of using these classes.
 * <p>
 * Создайте классы Square(Площадь) и Rectangles (Прямоугольники) с методами расчета периметра и квадрата.
 * Дайте свои предложения об отношениях между классами
 * (is-a, has-a, use-a и т. д.). Напишите хорошо прокомментированный код с примерами использования этих классов
 * <p>
 * Write code for reading and writing collections of these objects from(into) file.
 * Find object with maximal square.
 * Find object with maximal perimeter.
 * Write code for handling the incorrect format of incoming file.
 * <p>
 * Написать код для чтения и записи коллекций этих объектов из (в) файла.
 * Найти объект с максимальным квадратом.
 * Найти объект с максимальным периметром.
 * Напишите код для обработки неправильного формата входящего файла.
 */


public abstract class Shape implements Serializable {

    private double length;
    private double height;

    public Shape(double length, double height) {
        this.length = length;
        this.height = height;
    }

    public double getPerimeter() {
        return length + height;
    }

    public double getArea() {
        return length * height;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }


}









package homeworks.shapes_square;


public class Payment {

    public static void main(String[] args) {

        System.out.println("Rectangles");

        Rectangles c = new Rectangles(7, 4);
        c.getPerimeter();
        c.getArea();
        c.getNumberofSidesForQuadrilaterals();

        System.out.println();
        System.out.println("Square");

        Square d = new Square(7, 7);
        d.getPerimeter();
        d.getArea();
        d.getNumberofSidesForQuadrilaterals();

    }

}

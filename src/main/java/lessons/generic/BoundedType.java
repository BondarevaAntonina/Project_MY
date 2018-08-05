package lessons.generic;

public class BoundedType {
    /*public static int compare(Comparable<Integer> comp1, Comparable<Integer> comp2) {
        return comp1.compareTo(comp2);
    }*/

    public static <E extends Comparable<E>> int compare(E comp1, E comp2) {
        return comp1.compareTo(comp2);
    }

    public static <E extends Number> int compareNumbers(E comp1, E comp2) {
        return Integer.compare(comp1.intValue(), comp2.intValue());
    }
}

class TestType {
    public static void main(String[] args) {
        BoundedType.compareNumbers(new Integer(3), new Double(8));
    }
}

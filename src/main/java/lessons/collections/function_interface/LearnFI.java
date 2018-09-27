package lessons.collections.function_interface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LearnFI {
    public static void main(String[] args) {
        Calculatable calculatable = (v1, v2) -> v1 + v2;
        Calculatable calculatable1 = (v1, v2) -> v1 - v2;

//        System.out.println(calculatable.sum(5, 7));

        Convertable<String, Integer> convertable = (v) -> {
            return Integer.parseInt(v) + 15;
        };

//        System.out.println(convertable.convert("45"));

//        showConvert((v) -> {return Integer.parseInt(v) + 15;}, "45");
//        showConvert(convertable, "45");

        Function<String, Integer> function = (s) -> Integer.parseInt(s);

        Integer apply = function.apply("87");

//        System.out.println(apply instanceof Integer);

//        System.out.println(apply);

        Consumer<Integer> consumer = (i) -> System.out.println(i);

        Supplier<String> supplier = () -> "Hello";

        System.out.println(supplier.get());

    }

    public static void showConvert(Convertable<String, Integer> convertable, String value) {
        System.out.println(convertable.convert(value));
    }
}

@FunctionalInterface
interface Calculatable {
    int sum(int v1, int v2);

    default void print() {
        System.out.println();
    }
}

@FunctionalInterface
interface Convertable<T, F> {
    F convert(T value);

}
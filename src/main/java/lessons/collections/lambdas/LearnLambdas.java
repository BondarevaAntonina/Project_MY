package lessons.collections.lambdas;

import lessons.collections.Man;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LearnLambdas {
    public static void main(String[] args) {
        List<Man> men = Arrays.asList(
                new Man(28, "John"),
                new Man(20, "Steeve"),
                new Man(15, "Stuff"),
                new Man(10, "Sam"));

//        men.forEach(m -> System.out.println(m));

        Predicate<Man> predicate = m -> m.getAge() < 20;

//        men.stream().filter(predicate).forEach(m -> System.out.println(m));
        Set<Man> collect = men.stream().filter(predicate).collect(Collectors.toSet());

    }
}



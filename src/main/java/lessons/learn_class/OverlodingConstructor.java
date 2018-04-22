package lessons.learn_class;

public class OverlodingConstructor {
    private int age;

    private String name;

    private int countOfChildren;

    public OverlodingConstructor(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public OverlodingConstructor(int age, String name, int countOfChildren) {
      /*  this.age = age;
        this.name = name;*/
        this(age, name);

        this.countOfChildren = countOfChildren;
    }
}

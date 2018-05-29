package lessons.learn_enum;

public class LearnEnum {

//    private LearnEnum learnEnum;

    public static void print(String sex) {//MAN, WOMAN

    }

    public static void print1(Sex sex) {//MAN, WOMAN

    }
}

class TestEnum {
    public static void main(String[] args) {
        Sex man = Sex.MAN;
        Sex man1 = Sex.MAN;
        Sex man2 = Sex.MAN;

        LearnEnum.print1(Sex.WOMAN);

        String sex = "Man";

        Sex.valueOf(sex.toUpperCase());

        for (Sex sex1 : Sex.values()) {

        }

        System.out.println(man.getShortName());

        //System.out.println(man == man1);
    }
}

enum Sex {
    MAN("Man"), WOMAN("Woman");

    private String shortName;

    private Sex(String name) {
        shortName = name;
    }

    public String getShortName() {
        return shortName;
    }
}

package homeworks.learn_enum;

public enum Sex {
    MAN("Man"), WOMAN("Woman");

    private String shortName;

    Sex(String name) {
        shortName = name;
    }

}

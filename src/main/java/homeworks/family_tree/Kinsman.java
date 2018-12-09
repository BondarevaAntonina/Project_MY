package homeworks.family_tree;

public enum Kinsman {
    MOTHER("mother"),
    FATHER("father"),
    SISTER("sister"),
    BROTHER("brother"),
    GRANDMOTHER("grandmother"),
    GRANDFATHER("grandfather"),
    GREATGRANDFATHER("greatGrandFather"),
    GREATGRANDMOTHER("greatGrandMother"),
    AUNT("aunt");

    private String nameKinsman;

    Kinsman(String nameRelative) {
        nameKinsman = nameRelative;
    }
}

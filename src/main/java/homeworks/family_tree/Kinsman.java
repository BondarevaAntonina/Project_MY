package homeworks.family_tree;

public enum Kinsman {
    MOTHER("mother"),
    FATHER("father"),
    SISTER("sister"),
    BROTHER("brother"),
    HUSBAND("husband"),
    WIFE("wife"),
    GRANDMOTHER("grandmother"),
    GRANDFATHER("grandfather"),
    GREATGRANDFATHER("greatGrandFather"),
    GREATGRANDMOTHER("greatGrandMother"),
    AUNT("aunt"),
    UNCLE("uncle");

    private String nameKinsman;

    Kinsman(String nameRelative) {
        nameKinsman = nameRelative;
    }
}

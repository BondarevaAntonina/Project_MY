package homeworks.family_tree;

public class TreeTest {

    public static void main(String[] args) {

        Familly familly = new Familly();

        familly.familyTreeParticularPerson(new Person("Zaxarov", "Alexseu", "Yuriivich",
                "M", 28, Duration.ALIVE, Kinsman.BROTHER));
    }

}

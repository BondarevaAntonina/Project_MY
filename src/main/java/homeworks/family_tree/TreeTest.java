package homeworks.family_tree;

public class TreeTest {

    public static void main(String[] args) {

        Familly familly = new Familly();

        Person you = new Person("Zaxarova", "Dariya", "Yuriivna",
                Gender.WOMAN, 32, Duration.ALIVE, null,0);

//        familly.showDirectRelatives("Zaxarova", "Dariya", "Yuriivna");
//
//        familly.familyTreeParticularPerson(you);

//        familly.printInfoTree();

//        familly.collectInfo();
        familly.showDirectRelativesBrotherSister(you);

    }

}

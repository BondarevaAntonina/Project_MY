package homeworks.family_tree;

/**
 * Created by antoni on 15.11.2018.
 */
public class Child extends Person {

    private String parent;


    public Child(String surname,
                 String firstName,
                 String middleName,
                 String gender,
                 int age,
                 Duration duration,
                 String parent) {
        super(surname, firstName, middleName, gender, age, duration);
        this.parent = parent;
    }
}

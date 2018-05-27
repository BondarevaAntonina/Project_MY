package my_lesson;

/**
 * Created by antoni on 23.03.2018.
 */
public class Contact {
    private String firstName;
    private String lastName;
    public Contact (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}

    public String getContact() {
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return "["+getContact()+"]";
    }
}
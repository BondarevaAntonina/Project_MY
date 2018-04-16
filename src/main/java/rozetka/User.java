package rozetka;

/**
 * Created by antoni on 21.03.2018.
 */
public class User {
    private static int minAgeToWorkInOurCompany;
    private String name;
    private static  String lastName;

    public static int getMinAgeToWorkInOurCompany() {
        return minAgeToWorkInOurCompany;
    }

    public static void setMinAgeToWorkInOurCompany(int minAgeToWorkInOurCompany) {
        User.minAgeToWorkInOurCompany = minAgeToWorkInOurCompany;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

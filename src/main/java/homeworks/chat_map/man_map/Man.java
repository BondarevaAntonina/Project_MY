package homeworks.chat_map.man_map;

/**
 * Created by antoni on 05.10.2018.
 */
public class Man {

    private String firstName;
    private String lastName;
    private String surName;
    private int age;
    private int countOfChildren;
    private Address address;

    public Man(String firstName, String lastName, String surName, int age, int countOfChildren, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.surName = surName;
        this.age = age;
        this.countOfChildren = countOfChildren;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public int getCountOfChildren() {
        return countOfChildren;
    }

    public Address getAddress() {
        return address;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCountOfChildren(int countOfChildren) {
        this.countOfChildren = countOfChildren;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Man{" + "firstName='" + firstName + '\'' + ", " +
                "lastName='" + lastName + '\'' + ", " +
                "surName='" + surName + '\'' + ", age=" + age + ", " +
                "countOfChildren=" + countOfChildren + ", " +
                "address=" + address + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Man man = (Man) o;

        if (age != man.age) return false;
        if (countOfChildren != man.countOfChildren) return false;
        if (!firstName.equals(man.firstName)) return false;
        if (!lastName.equals(man.lastName)) return false;
        if (!surName.equals(man.surName)) return false;
        return address.equals(man.address);
    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + surName.hashCode();
        result = 31 * result + age;
        result = 31 * result + countOfChildren;
        result = 31 * result + address.hashCode();
        return result;
    }
}

package homeworks.overloading_overriding_home;

/**
 * Создать класс Person с поля firstName (String), lastName (String), age (int), gender (String), phoneNumber (int),
 *  и пять перегруженных методов, которые задают эти поля с разными списками аргументов.
 *  Создайте класс, который будет использовать экземпляр класса Person и его методы.
 */
public class Person {
    String firstName;
    String lastName;
    int age;
    String gender;
    int phoneNumber;

    public Person(String firstName, String lastName, int age, String gender, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    public void print(String firstName, String lastName, int age, String gender, int phoneNumber) {
        String dataPerson = firstName + " " + lastName + age + " " + gender + " " + phoneNumber;
        System.out.println(dataPerson);
    }

    public static void main(String[] args) {



    }
}

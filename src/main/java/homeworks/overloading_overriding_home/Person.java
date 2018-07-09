package homeworks.overloading_overriding_home;

/**
 * Создать класс Person с поля firstName (String), lastName (String), age (int), gender (String), phoneNumber (int),
 * и пять перегруженных методов, которые задают эти поля с разными списками аргументов.
 * Создайте класс, который будет использовать экземпляр класса Person и его методы.
 */
public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private int phoneNumber;

    public Person() {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;

    }


    public void print(String firstName, String lastName, int age, String gender, int phoneNumber) {
        String dataPerson = String.format("фамилия: %s имя: %s возраст: %d, пол: %s, телефон: %d",
                firstName, lastName, age, gender, phoneNumber);
        System.out.println(dataPerson);

    }

    public void print(String firstName, String lastName, int age, String gender) {
        String dataPerson2 = String.format("фамилия: %s имя: %s возраст: %d, пол: %s", firstName, lastName, age, gender);
        System.out.println(dataPerson2);
    }

    public void print(String firstName, String lastName, int age) {
        String dataPerson3 = String.format("фамилия: %s имя: %s возраст: %d", firstName, lastName, age);
        System.out.println(dataPerson3);
    }

    public void print(String firstName, String lastName) {
        String dataPerson4 = String.format("фамилия: %s имя: %s", firstName, lastName);
        System.out.println(dataPerson4);
    }

    public void print(String firstName, String lastName, String gender) {
        String dataPerson5 = String.format("фамилия: %s имя: %s пол: %s", firstName, lastName, gender);
        System.out.println(dataPerson5);
    }


    public static void main(String[] args) {

        Person person = new Person();

        person.print("Petrienko", "Ivan", 30, "M", 5252);
        person.print("Poleev ", "Oleg", 35, "M ");
        person.print("Sereda", "Pavel", 27, "20");
        person.print("Chernishew", "Bogdan");
        person.print("Cherkas", "Petya","M");

    }
}

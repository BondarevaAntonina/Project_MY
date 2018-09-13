package lessons.collections;

public class Man implements Comparable<Man> {
    private int age;
    private String name;

    public Man(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Man{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Man man = (Man) o;

        if (age != man.age) return false;
        return name.equals(man.name);
    }
    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + name.hashCode();
        return 31;
    }

    @Override
    public int compareTo(Man o) {
        return Integer.compare(this.age, o.getAge());
    }
}

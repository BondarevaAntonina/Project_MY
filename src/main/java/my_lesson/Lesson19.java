package my_lesson;

/**
 * Created by antoni on 20.03.2018.
 */
public class Lesson19 {
    public static void main(String[] args) {

    }
}
    class Human{
        String name;
        int age;

        public Human(String bob, int i) {
        }

        public String getName() {
            return name;
        }

        public  void setName(String name) {
            this.name = name;

        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
        public void getInfo(){
            System.out.println(name+ "" + age);
        }
    }




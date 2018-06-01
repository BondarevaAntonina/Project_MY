package homeworks.Enum;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by antoni on 29.05.2018.
 */
public class TestManEnum {
    private String name;
    private static Sex Sex;
    private String surname;
    private String age;
    private String post;

    public static void main(String[] args) {


        TestManEnum testManEnum = new TestManEnum();

    }
        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public String getSurname () {
            return surname;
        }

        public void setSurname (String surname){
            this.surname = surname;
        }

        public String getAge () {
            return age;
        }

        public void setAge (String age){
            this.age = age;
        }

        public String getPost () {
            return post;
        }

        public void setPost (String post){
            this.post = post;
        }

        public String toString () {
            return name + " " + Sex + " " + surname + " " + age + " " + post + " ";
        }

        public static boolean showSamePost (String testString){
            Pattern p = Pattern.compile("Team Lead");
            Matcher m = p.matcher(testString);
            System.out.println(showSamePost("Team Load"));
            System.out.println(showSamePost("Teem Load"));

            return m.matches();

        }

    }



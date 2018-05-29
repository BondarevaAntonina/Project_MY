package lessons.pass_params;

public class PassParams {
    public static void print(int a) {
        a = 15;
    }

    public static void printObject(final Table table) {
        table.setName("Another name");
//        table = new Table("");
    }

    public static void printObject1(String str) {//str = "Blue"
        str = "Another name";//new String("Another name")
    }
}

class TestParams {
    public static void main(String[] args) {

        int a = 10;

        PassParams.print(a);

//        System.out.println(a);

        Table table = new Table("Green");

        PassParams.printObject(table);

//        System.out.println(table.getName());

        String result = "Blue";


        PassParams.printObject1(result);

        System.out.println(result);
    }
}


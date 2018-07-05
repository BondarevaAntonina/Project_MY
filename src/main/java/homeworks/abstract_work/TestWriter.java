package homeworks.abstract_work;

import java.util.Scanner;

/**
 * Created by antoni on 02.07.2018.
 */
public class TestWriter {


    String textUserConsole;

    public TestWriter(String textUserConsole) {
        this.textUserConsole = textUserConsole;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text");
        String textUserConsole = sc.nextLine();
        DescendantWriter descendantWriter = new DescendantWriter();
        descendantWriter.write(textUserConsole);

        DescendantReader descendantReader = new DescendantReader();
        descendantReader.read();
    }



}
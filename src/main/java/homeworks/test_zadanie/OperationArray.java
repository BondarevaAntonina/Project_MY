package homeworks.test_zadanie;

import java.util.Scanner;

/**
 * Created by antoni on 25.05.2018.
 */
public class OperationArray {

    public static final Scanner SCANNER = new Scanner(System.in);

    private MyArrayList myArrayList;

    public OperationArray() {
        myArrayList = new MyArrayList();
    }

    public static void main(String[] args) {
        OperationArray operationArray = new OperationArray();
        operationArray.showMenuOperationArray();


//        int[] data = {1, 4, 3, 2, 6, 7, 0, 0, 0,0};
//        MyArrayList myArrayList = new MyArrayList();
//        myArrayList.addElement(99);
//        System.out.println(myArrayList.toString());

    }

    public void showMenuOperationArray() {

        int actionNumber;

        do {
            System.out.println("------- Menu -----------\n" +
                    "1 - Add an item to the list");
            System.out.println("2 - Create method for resizing array");
            System.out.println("3 - Delete items by index");
            System.out.println("4 - Increase the sheet by a specified number of elements");
            System.out.println("5 - Reducing the sheet to a specified number of elements");
            System.out.println("6 - Output elements to the console in the forward and reverse order");
            System.out.println("7 - Output of elements to the console in the opposite direction");
            System.out.println("8 - Sorting sheet by bubble method");
            System.out.println("9 - Adding an Array to an Array");
            System.out.println("10 - Delete duplicates");
            System.out.println("0 - Exit");
            try {
                actionNumber = SCANNER.nextInt();
                doAction(actionNumber);
            } catch (Exception e) {
                System.out.println("Ошибка ввода: " + e);
                actionNumber = -1;
            }
        } while (actionNumber != 0);
    }

    public void doAction(int actionNumber) {

        switch (actionNumber) {
            case 1:
                System.out.println("Enter number ");

                int number = SCANNER.nextInt();

                myArrayList.addElement(number);
                break;

                case 6:
                    myArrayList.toString1();
                    break;
        }

    }
}

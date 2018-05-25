package homeworks.test_zadanie;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by antoni on 25.05.2018.
 */
public class OperationArray {
    private int mArraylist[];


    public static void main(String[] args) {


//        int[] data = {1, 4, 3, 2, 6, 7, 0, 0, 0};
        int[] data = new int[10];
        MyArrayList myArrayList = new MyArrayList(data);
        myArrayList.setZeroElement(99);
        System.out.println(myArrayList.toString());


    }

    public void showMenuOperationArray() {
        int counter;

        int numm;

        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        numm = scaner.nextInt();
        mArraylist = new int[numm];

        System.out.println("Enter the " + numm + " numbers");
        for (counter = 0; counter < numm; counter++) {
            mArraylist[counter] = scaner.nextInt();
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int actionNumber;
        do {
            System.out.println("------- Menu -----------");
            System.out.println("1 - Add an item to the list");
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
                actionNumber = Integer.parseInt(reader.readLine());
                doAction(actionNumber);
            } catch (Exception e) {
                System.out.println("Ошибка ввода: " + e);
                actionNumber = -1;
            }
        } while (actionNumber != 0);
    }

    public void doAction(int actionNumber) throws Exception {
        switch (actionNumber) {
            case 1:
//                mArraylist = MyArrayList.setZeroElement(mArraylist, 77);
                break;
        }
    }
}

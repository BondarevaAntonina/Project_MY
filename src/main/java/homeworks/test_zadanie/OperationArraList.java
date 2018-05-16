package homeworks.test_zadanie;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.invoke.MethodHandles;
import java.util.Scanner;


/**
 * Created by antoni on 10.05.2018.
 */
public class OperationArraList {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    static int arraylist[];


    public static void main(String[] args) throws Exception {
        showMenu(args);
    }

    public static void showMenu(String[] args) {

        int counter;

        int numm;

        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        numm = scaner.nextInt();
        arraylist = new int[numm];

        System.out.println("Enter the " + numm + " numbers");
        for (counter = 0; counter < numm; counter++) {
            arraylist[counter] = scaner.nextInt();
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

    public static void doAction(int actionNumber) throws Exception {

//        int[] list = null;
        switch (actionNumber) {
            case 1:
                arraylist = IntArrayList.addElementToEnd(arraylist, 77);
                break;
            case 2:
                arraylist = IntArrayList.removeElementByIndex(arraylist, 5, 4);
                break;
            case 3:
                arraylist = IntArrayList.deleteElementIndex(arraylist, 9);
                break;
            case 4:
                arraylist = IntArrayList.addEmptyElement(arraylist, 5);
                break;
            case 5:
                arraylist = IntArrayList.deleteEmptyElement(arraylist, 2);
                break;
            case 6:
                arraylist = IntArrayList.forwardReverseOrder(arraylist);
                break;
            case 7:
                arraylist = IntArrayList.reverseOrder(arraylist);
                break;
            case 8:
                arraylist = IntArrayList.blisterSort(arraylist);
                break;
//            case 9:
//                arraylist = IntArrayList.addArrayToArray();
//                break;
            case 10:
                arraylist = IntArrayList.searchLinear(arraylist, 2);
                break;
            default:
                return;
        }
        IntArrayList.toString(arraylist);
        System.out.println("");
    }
}
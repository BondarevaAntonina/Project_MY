package homeworks.test_zadanie;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by antoni on 25.05.2018.
 */
public class OperationArray {

    public static final Scanner SCANNER = new Scanner(System.in);

    private MyArrayList myArrayList;

    public OperationArray() throws IOException {
        myArrayList = new MyArrayList();
        //System.setOut();
    }

    public static void main(String[] args) throws IOException {


        OperationArray operationArray = new OperationArray();
        operationArray.showMenuOperationArray();

    }


    public void showMenuOperationArray() {

        int actionNumber;

        do {
            System.out.println("------- Menu -----------\n" +
                    "1 - Add an item to the list\n" +
                    "2 - Create method for resizing array\n" +
                    "3 - Delete items by index\n" +
                    "4 - Increase the sheet by a specified number of elements\n" +
                    "5 - Reducing the sheet to a specified number of elements\n" +
                    "6 - Output elements to the console in the forward and reverse order\n" +
                    "7 - Output of elements to the console in the opposite direction\n" +
                    "8 - Sorting sheet by bubble method\n" +
                    "9 - Adding an Array to an Array\n" +
                    "10 -Delete duplicates\n" +
                    "11 -Searching for an element using the linear search method\n" +
                    "0 - Exit");
            try {
                actionNumber = SCANNER.nextInt();
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
                System.out.println("Enter number ");

                int number = SCANNER.nextInt();

                System.out.print("Inserted array elements: " +  number);

                myArrayList.addElement(number);
                break;

            case 2:
                System.out.println("Enter index");
                int index = SCANNER.nextInt();
                System.out.println("Enter element number");
                int valueInd = SCANNER.nextInt();
                myArrayList.changeElementByIndex(index, valueInd);
                break;

            case 3:
                System.out.println("Enter the index to delete");
                int deleteIndex = SCANNER.nextInt();
                myArrayList.deleteElementByIndex(deleteIndex);
                break;

            case 4:
                System.out.println("Enter a number to increase the array by a certain number of elements");
                int addcount = SCANNER.nextInt();
                myArrayList.increaseArray(addcount);
                break;

            case 5:
                System.out.println("Enter a number to reducing the array by a certain number of elements");
                int colelement = SCANNER.nextInt();
                myArrayList.decreaseArray(colelement);
                break;

            case 6:
                myArrayList.printInRightOrder();
                break;

            case 7:
                myArrayList.printInReverseOrder();
                break;

            case 8:
                myArrayList.blisterSort();
                break;

            case 9:
                System.out.println("Enter array length: ");
                int size = SCANNER.nextInt();

                int newArray[] = new int[size];

                for (int i = 0; i < size; i++) {
                    newArray[i] = SCANNER.nextInt();
                }

                System.out.print("Inserted array elements:");
                for (int i = 0; i < size; i++) {
                    System.out.print(" " + newArray[i]);
                }
                System.out.println();
                myArrayList.addArrayToArray();
                break;

            case 10:
                myArrayList.deleteDuplicates();
                break;

            case 11:
                System.out.println("Enter a number");
                int item = SCANNER.nextInt();
                myArrayList.searchLinear(item);
                break;
            case 12:
                System.out.println("Enter a number");
                myArrayList.resizeArray();
                break;
        }

    }

}

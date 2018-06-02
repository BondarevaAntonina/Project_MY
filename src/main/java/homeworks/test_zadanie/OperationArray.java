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
//        myArrayList.deleteElementByIndex(4);
//        System.out.println(myArrayList.toString());
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
                    "10 - Delete duplicates\n" +
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
                myArrayList.addElement(number);
                break;

            case 2:
                System.out.println("Enter index");
                int index  = SCANNER.nextInt();
                System.out.println("Enter element number");
                int valueInd = SCANNER.nextInt();
                myArrayList.changeElementByIndex(index, valueInd);
                break;

            case 3:
                System.out.println("Enter the index to delete");
                int deleteIndex= SCANNER.nextInt();
                myArrayList.deleteElementByIndex(deleteIndex);
                break;

            case 4:
                System.out.println("Enter a number to increase the array by a certain number of elements");
                int addcount= SCANNER.nextInt();
                myArrayList.increaseArray(addcount);
                break;

            case 5:
                System.out.println("Enter a number to reducing the array by a certain number of elements");
                int colelement= SCANNER.nextInt();
                myArrayList.decreaseArray(colelement);
                break;

            case 6:
                myArrayList.toString1();
                break;

            case 7:
                myArrayList.printInReverseOrder();
                break;

            case 8:
                myArrayList.blisterSort();
                break;

            case 11:
                System.out.println("Enter a number");
                int item= SCANNER.nextInt();
                myArrayList.searchLinear(item);
                break;
        }

    }
}

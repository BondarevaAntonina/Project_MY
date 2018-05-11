package homeworks.test_zadanie;

/**
 * Created by antoni on 10.05.2018.
 */
public class OperationArraList {

    public static void main(String[] args) throws Exception {

        int[] account = new int[]{5, 4, 7, 8, 3, 2, 9, 4, 7, 5};


        //1 - Add an item to the list
        int[] newarray = IntArrayList.addElementToEnd(account, 44);
        IntArrayList.toString(newarray);
        System.out.println("1 - Add an item to the list");

        //2 - create method for resizing array
        int[] removearray = IntArrayList.removeElementByIndex(account, 5, 4);
        IntArrayList.toString(removearray);
        System.out.println("2 - create method for resizing array");

        //3 - Delete items by index
        int[] arraydelete = IntArrayList.deleteElementIndex(account, 9);
        IntArrayList.toString(arraydelete);
        System.out.println("3 - Delete items by index");

        //4 - Increase the sheet by a specified number of elements
        int[] addempty = IntArrayList.addEmptyElement(account,5);
        IntArrayList.toString(addempty);
        System.out.println("4 - Increase the sheet by a specified number of elements");

        //5 - Reducing the sheet to a specified number of elements
        int[] deleteempty = IntArrayList.deleteEmptyElement(account,2);
        IntArrayList.toString(deleteempty);
        System.out.println("5 - Reducing the sheet to a specified number of elements");

        //6 - Output elements to the console in the forward and reverse order
        int[] forward = IntArrayList.forwardReverseOrder(account);
        IntArrayList.toString(forward);
        System.out.println("6 - Output elements to the console in the forward and reverse order");

        //7 - Output of elements to the console in the opposite direction
        int[] reverse = IntArrayList.reverseOrder(account);
        IntArrayList.toString(reverse);
        System.out.println("7 - Output of elements to the console in the opposite direction");

    }
}

package homeworks.test_zadanie;

import java.util.Scanner;

/**
 * Created by antoni on 10.05.2018.
 */
public class OperationArraList {

    public static void main(String[] args) throws Exception {

        int counter;
        int arraylist[];
        int numm;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        numm = input.nextInt();
        arraylist = new int[numm];

        System.out.println("Enter the " + numm + " numbers");
        for (counter = 0; counter < numm; counter++) {
            arraylist[counter] = input.nextInt();
        }




        //1 - Add an item to the list
        int[] newarray = IntArrayList.addElementToEnd(arraylist, 77);
        System.out.println("Add an item to the list");
        IntArrayList.toString(newarray);


        //2 - create method for resizing array
        int[] removearray = IntArrayList.removeElementByIndex(arraylist, 5, 4);
        System.out.println(" 2 - create method for resizing array");
        IntArrayList.toString(removearray);


        //3 - Delete items by index
        int[] arraydelete = IntArrayList.deleteElementIndex(arraylist, 9);
        System.out.println(" 3 - Delete items by index");
        IntArrayList.toString(arraydelete);


        //4 - Increase the sheet by a specified number of elements
        int[] addempty = IntArrayList.addEmptyElement(arraylist,5);
        System.out.println(" 4 - Increase the sheet by a specified number of elements");
        IntArrayList.toString(addempty);


        //5 - Reducing the sheet to a specified number of elements
        int[] deleteempty = IntArrayList.deleteEmptyElement(arraylist,2);
        System.out.println(" 5 - Reducing the sheet to a specified number of elements");
        IntArrayList.toString(deleteempty);


        //6 - Output elements to the console in the forward and reverse order
        int[] forward = IntArrayList.forwardReverseOrder(arraylist);
        System.out.println(" 6 - Output elements to the console in the forward and reverse order");
        IntArrayList.toString(forward);


        //7 - Output of elements to the console in the opposite direction
        int[] reverse = IntArrayList.reverseOrder(arraylist);
        System.out.println(" 7 - Output of elements to the console in the opposite direction");
        IntArrayList.toString(reverse);


        //8 - Sorting sheet by bubble method
        int[] blister = IntArrayList.blisterSort(arraylist);
        System.out.println(" 8 - Sorting sheet by bubble method");
        IntArrayList.toString(blister);


        //10 - Delete duplicates
        int[] dublicat = IntArrayList.deleteDublicat(arraylist, 5);
        System.out.println(" 10 - Delete duplicates");
        IntArrayList.toString(dublicat);


        //11 - Searching for an element using the linear search method
        int[] search = IntArrayList.searchLinear(arraylist, 2);
        System.out.println(" 11 - Searching for an element using the linear search method");
        IntArrayList.toString(search);


    }
}

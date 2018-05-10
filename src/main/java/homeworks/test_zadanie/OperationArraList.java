package homeworks.test_zadanie;

/**
 * Created by antoni on 10.05.2018.
 */
public class OperationArraList {

    public static void main(String[] args) {

        int[] account = new int[]{5, 4, 7, 8, 3, 2, 9, 4, 7, 5};
        int[] newarray= IntArrayList.addElementToEnd(account, 77);
        IntArrayList.toString( newarray);

        int[] arraydelete=IntArrayList.deleteElement(account,9);
        IntArrayList.toString( arraydelete);
    }
}

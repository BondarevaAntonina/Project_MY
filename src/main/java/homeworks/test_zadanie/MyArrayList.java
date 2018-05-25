package homeworks.test_zadanie;

/**
 * Created by antoni on 25.05.2018.
 */
public class MyArrayList {

    private int mArraylist[];

    public MyArrayList(int[] array) {
        setArray(array);
    }

    public void setArray(int[] array) {
        this.mArraylist = array;
    }


    //1 - Add an item to the list
    public void setZeroElement(int value) {
        if (value == 0) return;
        for (int i = 0; i < mArraylist.length; i++) {
            if (mArraylist[i] == 0) {
                mArraylist[i] = value;
                break;
            }
        }
    }

    //2 - create method for resizing array
    public void changeElementByIndex(int index, int value) {

        mArraylist[index] = value;
    }









    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < mArraylist.length; i++) {
            result = result.concat(String.valueOf(mArraylist[i]));
            if (i != mArraylist.length - 1) result = result.concat(",");
        }
        return result;
    }


}

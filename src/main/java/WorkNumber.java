/**
 * Created by antoni on 20.11.2017.
 */
public class WorkNumber {

    public int a; // 1-е число
    public int g; // 2-е число


    public int getMaxNumber(int i1, int i2) {
        if (i1 < 0 || i2 < 0) {
            return 0;
        }
        return Math.max(i1, i2);
    }

    public int getMinNumber(int i1, int i2) {
        if (i1 > 0 || i2 > 0) {
            return 0;
        }
        return Math.max(i1, i2);
    }
}





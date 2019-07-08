package inna;

/**
 * Created by antoni on 25.02.2019.
 */
public class ArrayChetnuu {


    public static void main(String[] args) {

        String str = "We are the champions, my friens!";
        for (int i = str.length()-1; i>=0; i--) {
            str = str + str.charAt(i);
        }
        str = str.substring(str.length()/2, str.length());
        System.out.println(str);
    }
}
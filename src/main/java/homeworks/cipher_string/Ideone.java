package homeworks.cipher_string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by antoni on 14.12.2018.
 */
public class Ideone {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);
        String User=in.nextLine();
        Map<String, String> hm = new HashMap<String, String>();
        hm.put("a", ".-");
        hm.put("b", "-...");
        hm.put("c", "-.-.");
        hm.put("d", "-..");
        hm.put("e",".");
        hm.put("f","..-.");
        hm.put("g","--.");
        hm.put("h","....");
        hm.put("i","..");
        hm.put("j",".---");
        hm.put("k","-.-");
        hm.put("l",".-..");
        hm.put("m","--");
        hm.put("n","-.");
        hm.put("o","---");
        hm.put("p",".--.");
        hm.put("q","--.-");
        hm.put("r",".-.");
        hm.put("s","...");
        hm.put("t","-");
        hm.put("u","..-");
        hm.put("v","...-");
        hm.put("w",".--");
        hm.put("x","-..-");
        hm.put("y","-.--");
        hm.put("z","--..");

        for (char letter : User.toCharArray()) {
            System.out.println(letter);
            for (String key : hm.keySet()) {
                if (letter == key.charAt(0)) {
                    System.out.print(hm.get(key));
                    System.out.print(" ");
                }
            }
        }
    }
}

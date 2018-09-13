package homeworks.regular_expressions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by antoni on 17.08.2018.
 * Имеется число переведенное в 2 - ую СС ( например, 0001010001).  Если в числе есть нули между(только!) двумя единицами,
 * то это считается "gap". Нужно найти максимальный "gap" в числе.
 */
public class MaxGapInNumber {

    public static void main(String[] args) {

//        String val = "0001010001";
//
//        int gap = 0;
//
//        boolean is1 = false;
//
//        int zerCount = 0;
//
//        for(int i=0; i< val.length(); i++){
//            if(is1 && zerCount > 1 && val.charAt(i) == '1'){
//                gap ++;
//                zerCount = 0;
//            }
//            if(val.charAt(i) == '1') {
//                is1 = true;
//            }
//            if(is1){
//                if(val.charAt(i) == '0') zerCount ++;
//            }
//        }
//        System.out.println(gap);
//        String regex = "/d[0-9]{10}$/";
        String regex = "(/d[0-1]{10}$/)+";

        String text = "0001010001";

        System.out.println(Pattern.matches(regex, text));

    }
}

class AnotherSolution {
    public static void main(String[] args) {

        String str = "1000101110100001001";

        Pattern pattern = Pattern.compile("10+1");

        Matcher matcher = pattern.matcher(str);

        int max = 0;

        while (matcher.find()) {
            int length = matcher.group().length() - 2;

            if (length > max) {
                max = length;
            }
        }

        System.out.println("Max gap = " + max);
    }
}

class AnotherSolution1 {
    public static void main(String[] args) {
        String str = "00010001011101100001001";//10001

        Pattern pattern = Pattern.compile("10+1");

        List<String> list = new ArrayList<>();

        StringBuilder builder = new StringBuilder();

        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            builder.append(matcher.group());
        }

        Pattern pattern1 = Pattern.compile("0+");

        Matcher matcher1 = pattern1.matcher(builder.toString());

        while (matcher1.find()) {
            list.add(matcher1.group());
        }

        int length = list.stream().max(Comparator.comparingInt(String::length)).get().length();

        System.out.println(length);
    }
}

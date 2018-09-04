package homeworks.regular_expressions;

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

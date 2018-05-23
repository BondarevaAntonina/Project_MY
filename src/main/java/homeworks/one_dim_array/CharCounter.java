package homeworks.one_dim_array;

/**
 * Created by antoni on 18.05.2018.
 * Подсчитать количество символов в строке, с учетом их повторений
 */

public class CharCounter {
    public static void main(String[] args) {

        String str = "Подсчитать количество символов в строке, с учетом их повторений";
/*
        int uniqueCharCount = 0;

        for(int i = 0; i< str.length(); i++){
            char currChar = str.charAt(i);
            if( !str.substring(0, i).contains( String.valueOf(currChar)))
                uniqueCharCount++;
        }
        System.out.println( "Length of the string = " + str.length());
        System.out.println( "Number of unique characters = " + uniqueCharCount);*/

        /*for (char symbol : str.toCharArray()) {

            int count = 0;

            for (char temp : str.toCharArray()) {
                if (symbol == temp) {
                    ++count;
                }
            }

            System.out.println("Symbol " + symbol + " appeas " + count + " times");
        }*/

        String symbol;
        int count = 0;
        String temp;

        for (int i = 0; i < str.length(); i++) {
            temp = str;

            symbol = String.valueOf(str.charAt(i));

            count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (!temp.contains(symbol)) {
                    break;
                }

                count++;

                int position = temp.indexOf(symbol);

                temp = temp.substring(position + 1);
            }

            str = str.replaceAll(symbol, " ");

            if (!symbol.equals(" ")) {
                System.out.println("Char " + symbol + " appears " + count + " times");
            }
        }
    }
}

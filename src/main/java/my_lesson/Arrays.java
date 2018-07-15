package my_lesson;

/**
 * Created by antoni on 07.03.2018.
 */
public class Arrays {
    public static void main(String[] args) {
     int number = 10; //примитивный тип данных [10]
     int [] numbers = new int [5]; // numbers -> [массив] Ссылочный тип данных/ Иннициализация массива
      //  char character = 'a'; //примитивный тип данных
      //  String s = "Hello.txt"; // ссылочный тип данных
      //  String s1 = new String("Hello.txt");
      //  System.out.println(numbers[0]); // 0 1 2 3 4
        for (int i = 0; i<numbers.length; i++){
            numbers[i] = i*10;
        }
        for (int i = 0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }
            System.out.println();
            int[] numbers1 = {1, 2, 3};
            for (int i = 0; i < numbers1.length; i++) {
                System.out.println(numbers1[i]);
            }
        }
    }

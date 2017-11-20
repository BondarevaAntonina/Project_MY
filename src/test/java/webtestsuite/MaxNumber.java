package webtestsuite;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by antoni on 14.11.2017.
 */



public class MaxNumber {

  //  @Title("Создание уполномоченного лица для удаления/редактирования")

    @Test
    public static  void main (String [] args) {

        int a = 10;
        int g = 20;
        MaxNumber c = new MaxNumber();
       System.out.println("Большее число из 2 чисел: " + Math.max(a,g));
       System.out.println("Меньшее число из 2 чисел: " + Math.min(a,g));


    }

}




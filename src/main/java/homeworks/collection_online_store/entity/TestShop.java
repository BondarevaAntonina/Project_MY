package homeworks.collection_online_store.entity;

import java.time.LocalDate;
import java.util.Scanner;

public class TestShop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        InternetShop shop = new InternetShop();

//        shop.showProductWithRelatedProducs("32LG27MP68VQ-P");
//
//        shop.removeProductWithRelatedProducs("Lenovo Tab 7 Essential TB-7304i 3G");


        shop.addProductsToBucket(new Product("32LG27MP68VQ-P", "Китай",
                LocalDate.of(2015, 10, 14), 6689,
                "Монитор 27 LG 27MP68VQ-P + 0,01% кредит на 5 мес", Category.COMPUTER,
                Subcategory.NOTEBOOK ), 7);


        shop.addProductsToBucket(new Product("Lenovo Tab 7 Essential TB-7304i 3G", "Китай",
                LocalDate.of(2017, 5, 17), 3399,
                "Планшет Lenovo Tab 7 Essential TB-7304i 3G 2/16GB NBC Black", Category.MOBILE,
                Subcategory.HEAD_PHONES), 7);


    }
}

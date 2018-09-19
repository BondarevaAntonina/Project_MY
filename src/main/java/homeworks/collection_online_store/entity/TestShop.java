package homeworks.collection_online_store.entity;

import java.time.LocalDate;
import java.util.Scanner;

public class TestShop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        InternetShop shop = new InternetShop();

        shop.showProductWithRelatedProducs("32LG27MP68VQ-P");

        shop.removeProductWithRelatedProducs("Lenovo Tab 7 Essential TB-7304i 3G");


        Product product = new Product("Mouse Samsung", "Китай",
                LocalDate.of(2017, 5, 17), 3399,
                "Mouse Samsung", Category.COMPUTER,
                Subcategory.MOUSE, 5);
        shop.addProduct(product);

        Person person = new Person("Irina", "Petrova", "peprori@ukr.net", "adres",
                                    City.KHARKOV);

        person.addProductToBucket(product,6);

        person.showSumByOrder();


    }
}

package homeworks.collection_online_store;

import java.util.ArrayList;

/**
 Создать приложение интернет - магазина. Приложение должен выполнять следующие операции:

 1) добавление товара(название, производитель, дата производства и т.д.).
 2) добавление сопутствующих товаров.
 3) удаление товара с сопутствующими товарами.
 4) создание корзины для каждого юзера.
 5) выбор товара по определенным критериям и после выводить сопутствующие товары.

 Примеры товаров: мобильные телефоны, телевизоры и т.д.
 */

public class OnlineStore {

    public static void main(String[] args) {

    }

    public void addProduct() {

        ArrayList<String> category = new ArrayList<String>();
        category.add("Компьютеры и ноутбуки");
        category.add("Бытовая техника, интерьер");
        category.add("Товары для дома");
        category.add("Сантехника и ремонт");

        System.out.printf("ArrayList has %d elements \n", category.size());
        for(String person : category){

            System.out.println(person);


        }
    }

}

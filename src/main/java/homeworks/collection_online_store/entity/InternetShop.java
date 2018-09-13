package homeworks.collection_online_store.entity;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class InternetShop {
    private List<Product> products;

    public InternetShop() {
        products = new LinkedList<>();

        products.addAll(Arrays.asList(
                new Product("32LG27MP68VQ-P", "Китай",
                        LocalDate.of(2015, 10, 14), 6689,
                        "Монитор 27 LG 27MP68VQ-P + 0,01% кредит на 5 мес", Category.COMPUTER, Subcategory.NOTEBOOK),

                new Product("Lenovo Tab 7 Essential TB-7304i 3G ", "Китай",
                        LocalDate.of(2017, 5, 17), 3399,
                        "Планшет Lenovo Tab 7 Essential TB-7304i 3G 2/16GB NBC Black", Category.MOBILE,
                        Subcategory.HEAD_PHONES),

                new Product("Mouse Samsung", "Китай",
                        LocalDate.of(2017, 5, 17), 3399,
                        "Mouse Samsung", Category.COMPUTER,
                        Subcategory.MOUSE),

                new Product("Nokia 10 Dual Sim Tempered Blue ", "Китай",
                        LocalDate.of(2016, 4, 7), 10999,
                        "13 Мпикс (цветная + оптическая стабилизация изображения) + 13 Мпикс (монохромная) ",
                        Category.MOBILE, Subcategory.HEAD_PHONES)));
    }

    public void showProductWithRelatedProducs(String name) {

        Product prod = null;

        for (Product product : products) {
            if (Objects.equals(product.getName(), name)) {
                prod = product;
                break;
            }
        }

        System.out.println(prod);

        for (Product product : products) {
            if (prod.getCategory() == product.getCategory() &&
                    !prod.getName().equals(product.getName()) &&
                    prod.getSubcategory() != product.getSubcategory()) {
                System.out.println(product);
            }
        }
    }


}

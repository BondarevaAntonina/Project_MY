package homeworks.learn_enum;

import homeworks.collection_online_store.OperationService;
import homeworks.collection_online_store.entity.Category;
import homeworks.collection_online_store.entity.Product;
import homeworks.collection_online_store.entity.Subcategory;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Title;

import java.time.LocalDate;

public class InternetShopTech {


    private OperationService os = new OperationService();


    @Title("Create Product")
    @Test
    public void testAddProduct() throws Exception {

          Product product1 = new Product("Монитор 27 LG 27MP68VQ-P ", "Китай ",
                    LocalDate.of(2015,10,14), 6689,
                    "Монитор 27 LG 27MP68VQ-P + 0,01% кредит на 5 мес",  Category.COMPUTER, Subcategory.PHONE);
            Product product2 = new Product("Планшет Lenovo Tab 7 Essential TB-7304i 3G ", "Китай ",
                    LocalDate.of(2017,5,17), 3399,
                    "Планшет Lenovo Tab 7 Essential TB-7304i 3G 2/16GB NBC Black",  Category.MOBILE,
                    Subcategory.HEAD_PHONES);

            Product product3 = new Product("Nokia 8 Dual Sim Tempered Blue ", "Китай ",
                    LocalDate.of(2016,4,7), 10999,
                    "13 Мпикс (цветная + оптическая стабилизация изображения) + 13 Мпикс (монохромная) ",
                    Category.MOBILE, Subcategory.HEAD_PHONES);

        os.addProduct(product1);
        os.addProduct(product2);
        os.addProduct(product3);

        }


    @Title("Create related Product")
    @Test
    public void testAddRelatedProduct() throws Exception {

                  Product product1 = new Product("Монитор 27 LG 27MP68VQ-P ", "Китай ",
                    LocalDate.of(2015,10,14), 6689,
                    "Монитор 27 LG 27MP68VQ-P + 0,01% кредит на 5 мес",  Category.COMPUTER, Subcategory.PHONE);
            Product product2 = new Product("Планшет Lenovo Tab 7 Essential TB-7304i 3G ", "Китай ",
                    LocalDate.of(2017,5,17), 3399,
                    "Планшет Lenovo Tab 7 Essential TB-7304i 3G 2/16GB NBC Black",  Category.MOBILE,
                    Subcategory.HEAD_PHONES);

            Product product3 = new Product("Nokia 8 Dual Sim Tempered Blue ", "Китай ",
                    LocalDate.of(2016,4,7), 10999,
                    "13 Мпикс (цветная + оптическая стабилизация изображения) + 13 Мпикс (монохромная) ",
                    Category.MOBILE, Subcategory.HEAD_PHONES);


            product2.addRelation(product1);
            product2.addRelation(product3);

            for(Product pr: product2.getRelatedProductList()){
                System.out.println(pr.toString());
            }
            product2.getRelatedProductList().remove(product1);
    }






}

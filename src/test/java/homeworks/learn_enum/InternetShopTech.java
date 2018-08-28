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

        os.addProduct(new Product("Монитор 27 LG 27MP68VQ-P", "Китай",
                            LocalDate.of(2015,10,14), 6689,
                  "Монитор 27\" LG 27MP68VQ-P + 0,01% кредит на 5 мес\n",  Category.COMPUTER, Subcategory.PHONE));

        os.addProduct(new Product("Планшет Lenovo Tab 7 Essential TB-7304i 3G\n", "Китай",
                LocalDate.of(2017,05,17), 3399,
                "Планшет Lenovo Tab 7 Essential TB-7304i 3G 2/16GB NBC Black",  Category.MOBILE, Subcategory.HEAD_PHONES));

        os.addProduct(new Product("Nokia 8 Dual Sim Tempered Blue\n", "Китай",
                LocalDate.of(2016,04,7), 10999,
                "13 Мпикс (цветная + оптическая стабилизация изображения) + 13 Мпикс (монохромная)\n",
                Category.MOBILE, Subcategory.HEAD_PHONES));

    }


    @Title("Create related Product")
    @Test
    public void testAddRelatedProduct() throws Exception {

//        os.addRelatedProductToProduct( );
    }

}

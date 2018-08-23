package homeworks.learn_enum;

import homeworks.collection_online_store.OperationService;
import homeworks.collection_online_store.entity.Product;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Title;

import java.time.LocalDate;

public class InternetShopTech {


    private OperationService os = new OperationService();


    @Title("Create Product")
    @Test
    public void testAddProduct() throws Exception {


        os.addProduct(new Product("Монитор 27 LG 27MP68VQ-P",
                    "Китай",
                            LocalDate.of(2015,10,14),
                       6689,
                  "Монитор 27\" LG 27MP68VQ-P + 0,01% кредит на 5 мес\n",  "Компьютеры и ноутбуки"));


        //String name, String breeder, LocalDate dateBreeder, double price, String description, Category category




    }


}

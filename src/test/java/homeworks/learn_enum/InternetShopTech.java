package homeworks.learn_enum;

import homeworks.collection_online_store.OperationService;
import homeworks.collection_online_store.entity.Category;
import homeworks.collection_online_store.entity.Product;
import org.junit.Assert;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Title;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;

public class InternetShopTech {

    OperationService os = new OperationService();

    @Title("Creating a text file")
    @Test
    public void testAddProduct() throws Exception {

        os.addProduct("Монитор 27 LG 27MP68VQ-P",
                    "Китай",
                            LocalDate.of(2015,10,14),
                       6689,
                  "Монитор 27\" LG 27MP68VQ-P + 0,01% кредит на 5 мес\n",
                List<Category>);

        //String name, String breeder, LocalDate dateBreeder, double price, String description, Category category




    }


}

package homeworks.collection_online_store.entity;

import java.time.LocalDate;

/**
 * Created by antoni on 04.09.2018.
 */
public class RelatedProduct extends Product{

    private int rebate;

    public RelatedProduct(String name, String breeder, LocalDate dateBreeder, double price, String description,
                          Category category, Subcategory subcategory, int rebate) {
        super(name, breeder, dateBreeder, price, description, category, subcategory);
        this.rebate = rebate;
    }


}

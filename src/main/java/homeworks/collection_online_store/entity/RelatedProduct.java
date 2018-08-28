package homeworks.collection_online_store.entity;

import java.time.LocalDate;

public class RelatedProduct extends Product{

    private int rebate;

    public RelatedProduct(String name, String breeder, LocalDate dateBreeder, double price, String description,
                          Category category, Subcategory subcategory, int rebate) {
        super(name, breeder, dateBreeder, price, description, category, subcategory);
        this.rebate = rebate;
    }

    public int getRebate() {
        return rebate;
    }

    public void setRebate(int rebate) {
        this.rebate = rebate;
    }
}

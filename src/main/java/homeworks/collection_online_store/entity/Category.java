package homeworks.collection_online_store.entity;

import java.time.LocalDate;
import java.util.List;

public class Category {


    private String nameCat;
    private String tags;
    private String sire;
    private List<Product> productList;
    private Subcategory subcategory;

    public Category(String name, String tags, String sire, List<Product> productList, Subcategory subcategory) {
        this.nameCat = name;
        this.tags = tags;
        this.sire = sire;
        this.productList = productList;
        this.subcategory = subcategory;
    }

    public String getName() {
        return nameCat;
    }

    public void setName(String name) {
        this.nameCat = name;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }




    @Override
    public String toString() {
        return getName() + " [Name: " + nameCat + "]";
    }

}

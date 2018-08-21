package homeworks.collection_online_store.entity;

import java.util.List;

public class Category {


    private String name;
    private String tags;


    private List<Product> productList;

    public Category() {
    }

    public Category(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return getName() + " [Name: " + name + "]";
    }

}

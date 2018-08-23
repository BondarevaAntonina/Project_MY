package homeworks.collection_online_store.entity;

import java.util.ArrayList;

public class Category {

    private String nameCategory;
    private String manufacturer;
    private ArrayList<Product> productList;
    private Subcategory subcategory;

    public Category(String name, String tags, String manufacturer, ArrayList<Product> productList, Subcategory subcategory) {
        this.nameCategory = name;
        this.manufacturer = manufacturer;
        this.productList = productList;
        this.subcategory = subcategory;
    }

    public String getName() {
        return nameCategory;
    }

    public void setName(String name) {
        this.nameCategory = name;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }




    @Override
    public String toString() {
        return getName() + " [Name: " + nameCategory + "]";
    }

}

package homeworks.collection_online_store.entity;

/**
 * название, производитель, дата производства и т.д.
 */

import java.time.LocalDate;
import java.util.ArrayList;

public class Product {

    private String name;
    private String breeder;
    private LocalDate dateBreeder;
    private double price;
    private String description;
    private Category category;
    private Subcategory subcategory;

    private ArrayList<Product> relatedProductList;
    // private LinkedList<RelatedProduct> mlinProducts;



    public Product(String name, String breeder, LocalDate dateBreeder, double price, String description, Category category, Subcategory subcategory) {
        relatedProductList = new ArrayList<Product>();
        this.name = name;
        this.breeder = breeder;
        this.dateBreeder = dateBreeder;
        this.price = price;
        this.description = description;
        this.category = category;
        this.subcategory = subcategory;
    }

    public String getName() {
        return "Name product: "  + name;
    }

    public void addRelation(Product product){
        relatedProductList.add(product);
    }

    public ArrayList<Product> getRelatedProductList() {
        return relatedProductList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreeder() {
        return "Breeder: "  + breeder;
    }

    public void setBreeder(String breeder) {
        this.breeder = breeder;
    }

    public LocalDate getDateBreeder() {

        return dateBreeder;
    }

    public void setDateBreeder(LocalDate dateBreeder) {
        this.dateBreeder = dateBreeder;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
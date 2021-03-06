package homeworks.collection_online_store.entity;

/**
 * название, производитель, дата производства и т.д.
 */

import java.time.LocalDate;
import java.util.Objects;

public class Product {

    private String name;
    private String breeder;
    private LocalDate dateBreeder;
    private double price;//change on float
    private String description;
    private Category category;
    private Subcategory subcategory;
    private int count;

    public Product(String name, String breeder, LocalDate dateBreeder, double price, String description,
                   Category category, Subcategory subcategory, int count) {
        this.name = name;
        this.breeder = breeder;
        this.count = count;
        this.dateBreeder = dateBreeder;
        this.price = price;
        this.description = description;
        this.category = category;
        this.subcategory = subcategory;
    }

    public int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreeder() {
        return breeder;
    }

    public LocalDate getDateBreeder() {

        return dateBreeder;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Subcategory getSubcategory() {
        return subcategory;
    }

    public double getPrice() {
        return price;
    }


    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", breeder='" + breeder + '\'' +
                ", dateBreeder=" + dateBreeder +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", category=" + category +
                ", subcategory=" + subcategory +
                ", count=" + count +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
                Objects.equals(name, product.name) &&
                Objects.equals(breeder, product.breeder) &&
                Objects.equals(dateBreeder, product.dateBreeder) &&
                Objects.equals(description, product.description) &&
                category == product.category &&
                subcategory == product.subcategory  &&
                Objects.equals(count, product.count);
    }
}
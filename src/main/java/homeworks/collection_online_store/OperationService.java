package homeworks.collection_online_store;

import homeworks.calendar.EventDate;
import homeworks.collection_online_store.entity.Category;
import homeworks.collection_online_store.entity.Product;

import java.time.LocalDate;
import java.util.ArrayList;

public class OperationService {

    private ArrayList<Product> products;

    public OperationService() {
        products = new ArrayList<>();

    }


    public void addProduct(String name, String breeder, LocalDate dateBreeder, double price, String description, Category category) {

        Product product = new Product( name,  breeder,  dateBreeder,  price,  description, category);

        products.add(product);
    }



}
